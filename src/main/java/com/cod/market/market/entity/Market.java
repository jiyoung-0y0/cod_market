package com.cod.market.market.entity;

import com.cod.market.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Market extends BaseEntity {

    private String email;
    private String name;
    private String info;

}
