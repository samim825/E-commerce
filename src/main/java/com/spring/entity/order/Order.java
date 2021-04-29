package com.spring.entity.order;

import com.spring.entity.BaseEntity;
import com.spring.entity.user.User;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order_table")
public class Order extends BaseEntity {

    @OneToOne
    private User user;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @OneToOne
    private OrderItems orderItems;

    @Column(name = "order_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus oderStatus;

}
