package com.ws.agro_shop.controller;

import com.ws.agro_shop.domain.Product;
import com.ws.agro_shop.service.ProductService;
import com.ws.agro_shop.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RequestMapping("/products/")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long productId) {
        if (productId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Optional<Product> product = this.productService.findById(productId);

        return product.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        HttpHeaders headers = new HttpHeaders();

        if (product == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.productService.save(product);
        return new ResponseEntity<>(product, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Product> updateProduct(@RequestBody Product product, UriComponentsBuilder builder) {
        HttpHeaders headers = new HttpHeaders();

        if (product == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.productService.save(product);
        return new ResponseEntity<>(product, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") Long id) {
        Optional<Product> product = this.productService.findById(id);

        if (!product.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.productService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = (List<Product>) this.productService.findAll();

        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
