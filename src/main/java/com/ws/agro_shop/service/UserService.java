package com.ws.agro_shop.service;

import com.ws.agro_shop.domain.User;

import java.util.Optional;

public interface UserService {

    <S extends User> S save(S s);

    Optional<User> findById(Long aLong);

    boolean existsById(Long aLong);

    Iterable<User> findAll();

    long count();
}
