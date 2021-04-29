package com.spring.entity.order;

import com.spring.entity.BaseEntity;
import com.spring.entity.user.User;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order_table")
public class Order extends BaseEntity {


    // mapping
    private User user;

    @Column(name = "total_price",nullable = false)
    private BigDecimal totalPrice;

    // mapping
    private List<OrderItems> orderItems;

    @Column(name = "orders_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
