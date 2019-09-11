package com.xavier.mosquitotrap.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "locality")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Locality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "locality_id")
    private Long localityId;

    @Column(name = "locality_name")
    private String localityName;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

    private Boolean active;
}
