package com.ws.agro_shop.controller;

import com.ws.agro_shop.domain.Product;
import com.ws.agro_shop.domain.User;
import com.ws.agro_shop.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;




@RequestMapping("/users/")
@RestController
public class UserController {//TODO

    @Autowired
    private UserServiceImpl userService;

    @Value("${upload.path}")
    private String uploadPath;



    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

    public String signUp(
            @RequestParam String login,
            @RequestParam String password,
            @RequestParam String email,
            @RequestParam String fullName,
            @RequestParam String phone,
            Map<String, Object> model,
            @RequestParam("image") MultipartFile userIconFile
    ) throws IOException {


         User user = new User();
        userService.save(user);

        model.put("operationResult", "messages");
        return "main";
    }


    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        HttpHeaders headers = new HttpHeaders();

        if (product == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

//        this.userService.save(product);
        return new ResponseEntity<>(product, headers, HttpStatus.CREATED);
    }
}
