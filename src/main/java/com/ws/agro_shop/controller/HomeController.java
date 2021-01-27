package com.ws.agro_shop.controller;

import com.ws.agro_shop.domain.Product;
import com.ws.agro_shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RequestMapping("/tests/")
@RestController
public class HomeController {

    @GetMapping("/main")
    public String base(Model model) {
        model.addAttribute("message", "Hello Page");
        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
                "<body>\n" + "Hello world\n" + "</body>\n" + "</html>";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("messages", "Hello Page");
        return "home.html";
    }

    @Autowired
    private ProductService productService;

    @GetMapping(value = "")
    public ResponseEntity<List<Product>> findAllProducts() {
        List<Product> products = this.productService.findAll();

        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long productId) {
        System.out.println("000000000000000000000");
        System.out.println("id - " + productId);
        if (productId == null) {
            System.out.println("null");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Optional<Product> product;

        if (Objects.isNull(product = this.productService.findById(productId))) {
            System.out.println(product);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        System.out.println(product);

        return new ResponseEntity(product, HttpStatus.OK);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        HttpHeaders headers = new HttpHeaders();
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.productService.save(product);
        return new ResponseEntity<>(product, headers, HttpStatus.CREATED);
    }


    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        HttpHeaders headers = new HttpHeaders();

        if (product == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if (Objects.nonNull(productService.findById((product.getId())))) {
            productService.update(product);
        }

        return new ResponseEntity<>(product, headers, HttpStatus.OK);
    }


    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") Long id) {
        Optional<Product> product = this.productService.findById(id);

        if (!product.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.productService.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
