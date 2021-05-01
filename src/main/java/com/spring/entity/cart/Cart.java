package com.spring.entity.cart;

import com.spring.entity.BaseEntity;
import com.spring.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cart extends BaseEntity {

    private BigDecimal totalPrice;

//    private User user;
//
//    private List<CartItem> cartItems;
}
