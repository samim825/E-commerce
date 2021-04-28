package com.spring.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by ABDUL MUKIT on 4/28/2021.
 */
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

}
