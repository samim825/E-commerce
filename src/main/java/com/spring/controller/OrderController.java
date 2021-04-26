package com.spring.controller;

import com.spring.entity.Order;
import com.spring.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/private/order")
public class OrderController {


    @Autowired
    OrderServiceImpl orderServiceImpl;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        order.setCreatedDate(new Date());
        order.setUpdatedDate(new Date());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderServiceImpl.create(order));
    }

    @PutMapping
    public ResponseEntity<Order> updateOrder(@RequestBody Order order){
        order.setUpdatedDate(new Date());
        return ResponseEntity.status(HttpStatus.OK)
                .body(orderServiceImpl.create(order));
    }


    @GetMapping
    public ResponseEntity<Page<Order>> getAllOrder(Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK)
                .body(orderServiceImpl.findAll(pageable));
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Optional<Order>> orderFindById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(orderServiceImpl.findById(id));
    }

    @DeleteMapping("id/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable String id){

        orderServiceImpl.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
