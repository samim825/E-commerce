package com.spring.controller;

import com.spring.entity.address.Address;
import com.spring.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/private/address")
public class AddressController {
    @Autowired
    AddressServiceImpl addressService;
    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address address){

        return ResponseEntity.status(HttpStatus.CREATED).body(addressService.create(address));
    }
    @PutMapping
    public ResponseEntity<Address>updateAddress(@RequestBody Address address){
        return  ResponseEntity.status(HttpStatus.OK).body(addressService.update(address));
    }
    @GetMapping("id/{id}")
    public ResponseEntity<Optional<Address>> findById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(addressService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<Address>> findAll(Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK)
                .body(addressService.findAll(pageable));
    }
    @DeleteMapping("id/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){

        addressService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
