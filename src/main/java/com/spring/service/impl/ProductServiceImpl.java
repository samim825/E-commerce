package com.spring.service.impl;

import com.spring.entity.Product;
import com.spring.repository.ProductRepository;
import com.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public Page<Product> findall(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);

    }
}
