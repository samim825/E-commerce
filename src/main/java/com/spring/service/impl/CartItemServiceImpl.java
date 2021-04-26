package com.spring.service.impl;

import com.spring.repository.CartItemRepository;
import com.spring.service.CartItemService;
import com.spring.entity.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartItemServiceImpl implements CartItemService
{
    @Autowired
    CartItemRepository cartItemRepository;

    @Override
    public CartItem create(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public CartItem update(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public Optional<CartItem> findbyId(String id) {
        return cartItemRepository.findById(id);
    }

    @Override
    public Page<CartItem> findAll(Pageable pageable) {
        return cartItemRepository.findAll(pageable);
    }

    @Override
    public void delete(String id) {
        cartItemRepository.deleteById(id);
    }
}
