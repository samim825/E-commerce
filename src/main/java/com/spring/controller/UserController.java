package com.spring.controller;

import com.spring.dto.UserDto;
import com.spring.entity.user.User;
import com.spring.mapper.UserMapper;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/private/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserMapper userMapper;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        user.setCreatedDate(new Date());
        user.setUpdatedDate(new Date());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.create(user));
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        user.setUpdatedDate(new Date());
        return ResponseEntity.status(HttpStatus.ACCEPTED)
            .body(userService.update(user));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<UserDto> findUserById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK)
            .body(userMapper.map(userService.findById(id)));
    }

    @GetMapping
    public ResponseEntity<Page<User>> findAllUsers(Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.findAll(pageable));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> DeleteUser(@PathVariable String id){
        userService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
}
