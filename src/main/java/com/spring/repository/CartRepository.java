package com.spring.repository;

import com.spring.entity.cart.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, String> {
}
