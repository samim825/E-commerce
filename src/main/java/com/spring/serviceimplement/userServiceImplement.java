package com.spring.serviceimplement;

import com.spring.entity.UserEntity;
import com.spring.repository.UserPerository;
import com.spring.service.userService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImplement implements userService {
    UserPerository userPerository;

    @Override
    public UserEntity AddUser(UserEntity ue) {

        return userPerository.save(ue);
    }

    @Override
    public UserEntity UpdateUser(UserEntity ue) {

        return userPerository.save(ue);
    }

    @Override
    public Optional<UserEntity> FindUserById(Integer id) {

        return userPerository.findById(id);
    }

    @Override
    public List<UserEntity> FindAllUser(Integer id) {

        return userPerository.findAll();
    }

    @Override
    public void DeleteUser(Integer id) {
        userPerository.deleteById(id);
    }
}
