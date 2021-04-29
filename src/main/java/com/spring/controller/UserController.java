package com.spring.controller;

import com.spring.entity.user.User;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/private/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

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
    public ResponseEntity<Optional<User>> findUserById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.FOUND)
            .body(userService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<User>> FindAllUsers(Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.findAll(pageable));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> DeleteUser(@PathVariable String id){
        userService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
}
