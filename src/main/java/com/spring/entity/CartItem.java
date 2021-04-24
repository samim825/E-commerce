package com.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_table")
public class CartItem extends BaseEntity {

    @Column(name = "Product_name")
    private String product_name;

    @Column(name = "Product_price")
    private Integer Product_price;

    @Column(name = "Quantity")
    private Integer quantity;

    // Todo User
}
