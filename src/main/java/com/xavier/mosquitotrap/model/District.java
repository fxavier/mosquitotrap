package com.xavier.mosquitotrap.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "district")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "district_id")
    private Long districtId;

    @Column(name = "district_name")
    private String districtName;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    private Boolean active;
}
