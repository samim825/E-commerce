package com.spring.service;

import com.spring.entity.OrderItems;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

/**
 * Created by User on 05-Apr-21.
 */
public interface OrderItemsService {


    public OrderItems create(OrderItems orderItems);

    public OrderItems update(OrderItems orderItems);

    public Optional<OrderItems> findById(String id);

    public Page<OrderItems> findAll(Pageable pageable);

    public void delete(String id);

}
