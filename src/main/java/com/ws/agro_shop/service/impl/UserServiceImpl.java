package com.ws.agro_shop.service.impl;

import com.ws.agro_shop.domain.User;
import com.ws.agro_shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserServiceImpl userService;

    @Override
    public <S extends User> S save(S s) {
        return userService.save(s);
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return userService.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return userService.existsById(aLong);
    }

    @Override
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @Override
    public long count() {
        return userService.count();
    }
}
