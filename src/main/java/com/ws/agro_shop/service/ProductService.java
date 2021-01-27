package com.ws.agro_shop.service;

import com.ws.agro_shop.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    <S extends Product> S save(S s);

    Optional<Product> findById(Long aLong);

    long count();

    void deleteById(Long aLong);

    Long create(Product product);

    void update(Product product);
}
