package com.spring.service;

import com.spring.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface userService {
    UserEntity AddUser(UserEntity ue);
    UserEntity UpdateUser(UserEntity ue);
    Optional<UserEntity>FindUserById(Integer id);
    List<UserEntity>FindAllUser(Integer id);
    void DeleteUser(Integer id);
}
