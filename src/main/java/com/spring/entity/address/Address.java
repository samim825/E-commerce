package com.spring.entity.address;

import com.spring.entity.BaseEntity;
import com.spring.entity.user.User;
import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address extends BaseEntity {

    @ManyToOne
    private User user;

    @Column(name = "country")
    private String country;

    @Column(name = "division")
    private String division;

    @Column(name="zilla")
    private String zilla;

    @Column(name = "thana")
    private String  thana;

    @Column(name="postal_code")
    private Integer postalCode;

    @Column(name = "address_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private AddressType type;

}
