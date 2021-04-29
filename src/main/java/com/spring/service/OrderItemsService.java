package com.spring.service;

import com.spring.entity.order.OrderItems;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

/**
 * Created by User on 05-Apr-21.
 */
public interface OrderItemsService {


    OrderItems create(OrderItems orderItems);

    OrderItems update(OrderItems orderItems);

    Optional<OrderItems> findById(String id);

    Page<OrderItems> findAll(Pageable pageable);

    void delete(String id);

}
