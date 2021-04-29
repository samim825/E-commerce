package com.spring.repository;

import com.spring.entity.order.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, String> {
}


