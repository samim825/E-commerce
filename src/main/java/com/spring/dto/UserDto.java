package com.spring.dto;


import com.spring.entity.address.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String username;

    private Address address;
}
