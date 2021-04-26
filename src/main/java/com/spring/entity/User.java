package com.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{

    @Column(name = "user name")
    private String userName;

    @Column(name="Contuct Number")
    private String userContactNumber;
}
