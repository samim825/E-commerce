package com.spring.service;

import com.spring.entity.CartItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CartItemService
{

    CartItem create(CartItem cartItem);

    CartItem update(CartItem cartItem);

    Optional<CartItem> findbyId(String id);

    Page<CartItem> findAll(Pageable pageable);

    void delete(String id);
}
