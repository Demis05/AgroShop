package com.ws.agro_shop.service;

import com.ws.agro_shop.domain.Product;

import java.util.Optional;

public interface ProductService {

    Iterable<Product> findAll();

    <S extends Product> S save(S s);

    Optional<Product> findById(Long aLong);

    long count();

    void deleteById(Long aLong);
}
