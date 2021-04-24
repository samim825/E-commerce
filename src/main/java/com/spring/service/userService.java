package com.spring.service;

import com.spring.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    UserEntity AddUser(UserEntity ue);
    UserEntity UpdateUser(UserEntity ue);
    UserEntity FindUserById(Integer id);
    UserEntity FindAllUser(Integer id);
    void DeleteUser(Integer id);
}
