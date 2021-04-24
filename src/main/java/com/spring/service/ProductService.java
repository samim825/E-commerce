package com.spring.service;

import com.spring.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {

     Product create(Product product);

     Product update(Product product);

     Optional<Product> findById(String id);

     Page<Product> findall(Pageable pageable);

     void delete(String id);

}
