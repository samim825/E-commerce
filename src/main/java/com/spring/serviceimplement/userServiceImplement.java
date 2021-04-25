package com.spring.serviceimplement;

import com.spring.entity.UserEntity;
import com.spring.repository.UserRepository;
import com.spring.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImplement implements userService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity AddUser(UserEntity ue) {

        return userRepository.save(ue);
    }

    @Override
    public UserEntity UpdateUser(UserEntity ue) {

        return userRepository.save(ue);
    }

    @Override
    public Optional<UserEntity> FindUserById(Integer id) {

        return userRepository.findById(id);
    }

    @Override
    public List<UserEntity> FindAllUser(Integer id) {

        return userRepository.findAll();
    }

    @Override
    public void DeleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
