package com.ws.agro_shop.service.impl;


import com.ws.agro_shop.domain.Product;
import com.ws.agro_shop.repository.ProductRepository;
import com.ws.agro_shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public <S extends Product> S save(S s) {
        return productRepository.save(s);
    }

    @Override
    public Optional<Product> findById(Long aLong) {
        return productRepository.findById(aLong);
    }

    @Override
    public long count() {
        return productRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        productRepository.deleteById(aLong);
    }

    @Override
    public Long create(Product product) {
        return null;
    }

    @Override
    public void update(Product product) {

    }
}
