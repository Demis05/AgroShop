package com.ws.agro_shop.repository;

import com.ws.agro_shop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    @Override
    Iterable<Product> findAll();

    @Override
    Iterable<Product> findAll(Sort sort);

    @Override
    Page<Product> findAll(Pageable pageable);

    @Override
    <S extends Product> S save(S s);

    @Override
    Optional<Product> findById(Long aLong);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);
}
