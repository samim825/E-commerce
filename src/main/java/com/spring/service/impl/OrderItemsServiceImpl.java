package com.spring.service.impl;

import com.spring.entity.order.OrderItems;
import com.spring.repository.OrderItemsRepository;
import com.spring.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderItemsServiceImpl implements OrderItemsService {

    @Autowired
    OrderItemsRepository orderItemsRepository;

    @Override
    public OrderItems create(OrderItems orderItems) {
        return orderItemsRepository.save(orderItems);
    }
    @Override
    public OrderItems update(OrderItems orderItems) {
        return orderItemsRepository.save(orderItems);
    }
    public Optional<OrderItems> findById(String id) {
        return orderItemsRepository.findById(id);
    }

    public Page<OrderItems> findAll(Pageable pageable){
        return orderItemsRepository.findAll(pageable);
    }

    public void delete(String id){
        orderItemsRepository.deleteById(id);
    }

}