package com.spring.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.entity.BaseEntity;
import com.spring.entity.address.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password", length = 200)
    private String password;

    @Column(name = "user_name")
    private String userName;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "last_password_reset_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPasswordResetDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Role> roles;


}
