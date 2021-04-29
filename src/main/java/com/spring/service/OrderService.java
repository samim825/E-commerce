package com.spring.service;


import com.spring.entity.order.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface OrderService {

    Order create(Order order);
    Order update(Order order);
    Optional<Order> findById(String id);
    Page<Order> findAll(Pageable pageable);
    void delete(String id);
}
