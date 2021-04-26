package com.spring.controller;

import com.spring.service.impl.CartItemServiceImpl;
import com.spring.entity.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/private/CartItem")
public class CartItemController {

    @Autowired
    CartItemServiceImpl cartItemServiceImpl;

    @PostMapping
    public CartItem createStudent(@RequestBody CartItem cartItem){

        return cartItemServiceImpl.create(cartItem);
    }

    @PutMapping
    public CartItem updateStudent(@RequestBody CartItem cartItem){

        return cartItemServiceImpl.update(cartItem);
    }

    @GetMapping
    public Page<CartItem> getAllstudents(Pageable pageable){

        return cartItemServiceImpl.findAll(pageable);
    }

    @GetMapping("/id/{id}")
    public Optional<CartItem> getStudentById(@PathVariable String id){
        return cartItemServiceImpl.findbyId(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteStudent(@PathVariable String id){
        cartItemServiceImpl.delete(id);
    }
}
