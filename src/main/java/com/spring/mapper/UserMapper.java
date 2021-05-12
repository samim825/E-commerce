package com.spring.mapper;

import com.spring.dto.UserDto;
import com.spring.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserMapper {

    public UserDto map(User user){
        UserDto dto = new UserDto();

        dto.setId(user.getId());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setUsername(user.getUserName());
        dto.setAddress(user.getAddress());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());

        return dto;
    }
}
