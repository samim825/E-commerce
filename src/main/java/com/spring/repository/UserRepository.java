package com.spring.repository;

import com.spring.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 4/25/2021.
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
