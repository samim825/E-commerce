package com.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends BaseEntity{

    @Column(name = "Customr's name")
    private String UserName;

    @Column(name="Contuct Number")
    private Integer UserContactNumber;
}
