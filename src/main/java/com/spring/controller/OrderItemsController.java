package com.spring.controller;

import com.spring.entity.order.OrderItems;
import com.spring.service.impl.OrderItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/private/order_items/")
public class OrderItemsController {

    @Autowired
    OrderItemsServiceImpl orderItemsService;



    @PostMapping
    public ResponseEntity createOrderItems(@RequestBody OrderItems orderItems){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderItemsService.create(orderItems));

    }

    @PutMapping
    public ResponseEntity updateOrderItems(@RequestBody OrderItems orderItems){
        return ResponseEntity.status(HttpStatus.CREATED).body(orderItemsService.update(orderItems));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<OrderItems>> getOrderItemsById(@PathVariable String id){
        return ResponseEntity.ok(orderItemsService.findById(id));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Optional<OrderItems>> deleteOrderItemsById(@PathVariable String id){
        orderItemsService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    public ResponseEntity <Page<OrderItems>> getAllOrderItems(Pageable pageable){
        return ResponseEntity.ok(orderItemsService.findAll(pageable));
    }


}
