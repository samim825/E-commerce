package com.spring.entity;

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

    // To do:  user;

    @Column(name = "total_price")
    private BigDecimal totalPrice;


    // To do: orderItems;

    // To do: oderStatus;

}
