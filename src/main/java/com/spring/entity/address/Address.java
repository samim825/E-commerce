package com.spring.entity.address;

import com.spring.entity.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address extends BaseEntity {

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

    @Column(name = "address_type")
    @Enumerated(EnumType.STRING)
    private AddressType type;

}
