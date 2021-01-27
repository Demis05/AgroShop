package com.ws.agro_shop.controller;

import com.ws.agro_shop.domain.User;
import com.ws.agro_shop.dto.UserDto;
import com.ws.agro_shop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@RequestMapping("/users/")
@RestController
public class UserController {

    //TODO прописать логи в методах
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long userId) {
        if (userId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Optional<User> user = userService.findById(userId);
        if (Objects.isNull(user)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        System.out.println(user);
        return new ResponseEntity(user, HttpStatus.OK);
//        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    /**
     * Creates new user
     *
     * @param createUserDto createUserDto
     * @return UserEntity that was created
     */

    /*      @RequestParam String login,
            @RequestParam String password,
            @RequestParam String email,
            @RequestParam String fullName,
            @RequestParam String phone,
            @RequestParam("image") MultipartFile userIconFile
            */
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<User> createUser(@RequestBody UserDto createUserDto) {//(@RequestBody User user) {
        if (createUserDto == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
//        User convertUser = conversionService.convert(createUserDto, User.class);//TODO universal VISITOR

        User savedUser = userService.save(null);//save(convertUser);
//        userService.notifyUserRegistration(savedUser);
//        LOGGER.info();
        return new ResponseEntity(savedUser, HttpStatus.CREATED);
//        return new ResponseEntity<>(userWithId, headers, HttpStatus.CREATED);
    }


    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        HttpHeaders headers = new HttpHeaders();

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if (Objects.nonNull(userService.findById((user.getId())))) {
            userService.update(user);
        }
        return new ResponseEntity<>(user, headers, HttpStatus.OK);
    }

    @RequestMapping()
    @PostMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAll();
        System.out.println(users);
        System.out.println(users.size());
        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
