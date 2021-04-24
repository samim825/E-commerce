package com.spring.entity;

import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UserEntity extends BaseEntity{
    @Column(name = "Customr's name")
    private String UserName;
    @Column(name="Contuct Number")
    private Integer UserContactNumber;
}
