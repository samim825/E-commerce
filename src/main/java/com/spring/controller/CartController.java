package com.spring.controller;

import com.spring.entity.Cart;
import com.spring.service.serviceImpl.CartServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/private/cart")
public class CartController {

    @Autowired
    CartServiceImpl cartService;

    @PostMapping
    public ResponseEntity<Cart> createCart(@RequestBody Cart cart){
        log.debug("Create a cart : "+cart);
        return ResponseEntity.status(HttpStatus.CREATED).body(cartService.create(cart));
    }


    @PutMapping
    public ResponseEntity<Cart> updateCart(@RequestBody Cart cart){
        log.debug("Update a cart : "+cart);
        return ResponseEntity.ok(cartService.create(cart));
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Optional<Cart>> findById(@PathVariable String id){
        log.debug("Find cart with this id : "+id);
        return ResponseEntity.ok(cartService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<Cart>> findAll(Pageable pageable){
        log.debug("Find all cart lists");
        return ResponseEntity.ok(cartService.findAll(pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable String id){
        log.debug("Delete a cart with this id : "+id);
        cartService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
