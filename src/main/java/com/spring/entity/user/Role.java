package com.spring.entity.user;

import com.spring.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "role")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "role_type")
    private RoleType roleType;
}
