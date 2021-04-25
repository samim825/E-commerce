package com.spring.controller;

import com.spring.entity.UserEntity;
import com.spring.serviceimplement.userServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    userServiceImplement userServiceImplement;

    @PostMapping("/add")
    public ResponseEntity<UserEntity> CreateUser(@RequestBody UserEntity ue){
        ue.setCreatedDate(new Date());
        ue.setUpdatedDate(new Date());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userServiceImplement.AddUser(ue));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserEntity> UpdateUser(@RequestBody UserEntity id){
        return ResponseEntity.status(HttpStatus.ACCEPTED)
            .body(userServiceImplement.UpdateUser(id));
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<UserEntity>>FindUser(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.FOUND)
            .body(userServiceImplement.FindUserById(id));
    }

    @GetMapping("/findall")
    public ResponseEntity<Page<UserEntity>> FindAllUsers(Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK)
                .body(userServiceImplement.FindAllUser(pageable));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> DeleteUser(@PathVariable Integer id){
        userServiceImplement.DeleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
}
