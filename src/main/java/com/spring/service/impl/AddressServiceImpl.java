package com.spring.service.impl;

import com.spring.entity.Address;
import com.spring.repository.AddressRepository;
import com.spring.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AddressServiceImpl implements AddressService{

@Autowired
AddressRepository addressRepository;

public Address create(Address address){
    return addressRepository.save(address);
}
public Address update(Address address){
    return addressRepository.save(address);
}
public Optional<Address>findById(String id){
    return  addressRepository.findById(id);
}
public Page<Address>findAll(Pageable pageable){
    return addressRepository.findAll(pageable);
}
public void delete (String id){
    addressRepository.deleteById(id);
}





}
