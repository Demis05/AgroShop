package com.ws.agro_shop.service;

import com.ws.agro_shop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;


public interface ProductService {

    Iterable<Product> findAll();

    Iterable<Product> findAll(Sort sort);

    Page<Product> findAll(Pageable pageable);

    <S extends Product> S save(S s);

    Optional<Product> findById(Long aLong);

    long count();

    void deleteById(Long aLong);
}
