package com.spring.entity.cart;

import com.spring.entity.BaseEntity;
import com.spring.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cart extends BaseEntity {

    @Column(name = "total_price")
    private BigDecimal totalPrice;
    @OneToOne
    private User user;
    @OneToMany
    private List<CartItem> cartItems;
}
