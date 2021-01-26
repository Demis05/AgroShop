package com.ws.agro_shop.service.impl;

import com.ws.agro_shop.domain.User;
import com.ws.agro_shop.repository.UserRepository;
import com.ws.agro_shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public <S extends User> S save(S s) {
        return userRepository.save(s);
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return userRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return userRepository.existsById(aLong);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public long count() {
        return userRepository.count();
    }
}
