package com.spring.controller;

import com.spring.service.impl.CartItemServiceImpl;
import com.spring.entity.cart.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/private/CartItem")
public class CartItemController {

    @Autowired
    CartItemServiceImpl cartItemServiceImpl;

    @PostMapping
    public ResponseEntity<CartItem> createStudent(@RequestBody CartItem cartItem){

        return ResponseEntity.status(HttpStatus.CREATED).body(cartItemServiceImpl.create(cartItem));
    }

    @PutMapping
    public ResponseEntity<CartItem> updateStudent(@RequestBody CartItem cartItem){

        return ResponseEntity.ok(cartItemServiceImpl.update(cartItem));
    }

    @GetMapping
    public ResponseEntity<Page<CartItem>> getAllstudents(Pageable pageable){

        return ResponseEntity.ok(cartItemServiceImpl.findAll(pageable));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<CartItem>> getStudentById(@PathVariable String id){
        return ResponseEntity.ok(cartItemServiceImpl.findbyId(id));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id){
        cartItemServiceImpl.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
