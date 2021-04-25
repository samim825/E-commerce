package com.spring.controller;

import com.spring.entity.UserEntity;
import com.spring.serviceimplement.userServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    userServiceImplement userServiceImplement;

    @GetMapping("/add{id}")
    public UserEntity CreateUser(@RequestBody id){

    }
    public void UpdateUser(){

    }
    public void FindUser(){

    }
    public void FindAllUsers(){

    }
    public String DeleteUser(){

    }
}
