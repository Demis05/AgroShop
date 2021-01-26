package com.ws.agro_shop.controller;

import com.ws.agro_shop.util.ErrorMessages;
import com.ws.agro_shop.domain.Product;
import com.ws.agro_shop.domain.User;
import com.ws.agro_shop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
@RequestMapping("/users/")
@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


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






    /**
     * Creates new user
     *
     * @param createUserDto createUserDto
     * @return UserEntity that was created
     */
//    @PostMapping(value = "/users")
//    @ResponseStatus(value = HttpStatus.CREATED)
//    public ApiResponseDataDto<String> create(@RequestBody UserDto createUserDto) {
//        User savedUser;
//        try {
//            User convertUser = conversionService.convert(createUserDto, User.class);
//            savedUser = userService
//                    .save(convertUser);
//        } catch (DataIntegrityViolationException e) {
//            LOGGER.info(MessageConstant.CAUSE, e);
//            throw new IllegalArgumentException(ErrorMessages.USER_ALREADY_EXISTS);
//        }
//        userService.notifyUserRegistration(savedUser);
//        return new ApiResponseDataDto<>(savedUser
//                .getId());
//    }



}
