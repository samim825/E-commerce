package com.spring.service;

import com.spring.entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Created by ABDUL MUKIT on 4/28/2021.
 */
public interface AddressService {
    Address create(Address address);
    Address update(Address update);
    Optional<Address> findById(String id);
    Page<Address> findAll (Pageable pageable);
    void delete(String id);
}
