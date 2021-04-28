package com.spring.repository;

import com.spring.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ABDUL MUKIT on 4/28/2021.
 */
public interface AddressRepository extends JpaRepository<Address,String> {
}
