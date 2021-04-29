package com.spring.entity.user;

import com.spring.entity.BaseEntity;
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
public class User extends BaseEntity {

    @Column(name = "user_name")
    private String userName;

    @Column(name="contuct_Number")
    private String userContactNumber;

    //TODO: billing Address, shipping address
}
