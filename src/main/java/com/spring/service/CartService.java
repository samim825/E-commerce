package com.spring.service;


import com.spring.entity.cart.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CartService {

    Cart create(Cart cart);

    Cart Update(Cart cart);

    Page<Cart> findAll(Pageable pageable);

    Optional<Cart> findById(String id);

    void delete(String id);
}
