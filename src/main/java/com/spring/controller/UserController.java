package com.spring.controller;

import com.spring.entity.UserEntity;
import com.spring.serviceimplement.userServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    userServiceImplement userServiceImplement;

    @PostMapping("/add")
    public UserEntity CreateUser(@RequestBody UserEntity ue){
        return userServiceImplement.AddUser(ue);
    }

    @PutMapping("/update/{id}")
    public UserEntity UpdateUser(@RequestBody UserEntity id){
        return userServiceImplement.UpdateUser(id);
    }

    @GetMapping("/find/{id}")
    public Optional<UserEntity>FindUser(@PathVariable Integer id){
        return userServiceImplement.FindUserById(id);
    }

    @GetMapping("/findall")
    public List<UserEntity> FindAllUsers(Pageable pageable){
        return userServiceImplement.FindAllUser(pageable);
    }
    public String DeleteUser(){
    return "yes";
    }
}
