package com.spring.entity.cart;

import com.spring.entity.BaseEntity;
import com.spring.entity.Product;
import com.spring.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem extends BaseEntity {

    @Column(name = "product_id")
    @ManyToOne
    private Product product;

    @Column(name = "cartItem_price")
    private BigDecimal price;

    @Column(name = "quantity")
    private Integer quantity;


}
