



package com.spring.entity.order;




import com.spring.entity.BaseEntity;
import com.spring.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.math.BigDecimal;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_items")
public class OrderItems extends BaseEntity {


    //@Column(name = "product")
    //private Product product;


    @Column(name = "order_price")
    private BigDecimal price;



    @Column(name = "order_quantity")
    private Integer quantity;

    @Column(name = "order_status")
    private String status;

    private Product product;
}

