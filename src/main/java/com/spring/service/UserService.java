package com.spring.service;

import com.spring.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    User create(User user);
    User update(User user);
    User findById(String id);
    Page<User> findAll(Pageable pageable);
    void delete(String id);
}
