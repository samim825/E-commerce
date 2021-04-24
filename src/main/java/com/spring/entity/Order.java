package com.spring.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="Order")
public class Order extends BaseEntity {

    // To do:  user;

    @Column(name = "total_price")
    private BigDecimal total_price;


    // To do: orderItems;

    // To do: oderStatus;

}
