package com.xavier.mosquitotrap.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "sop")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Sop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sop_id")
    private Long sopId;

    @Column(name = "sop_code")
    private String sopCode;

    @Column(name = "sop_name")
    private String sopName;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

    private Boolean active;
}
