package com.xavier.mosquitotrap.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "community")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "community_id")
    private Long communityId;

    @Column(name = "community_name")
    private String communityName;

    @ManyToOne
    @JoinColumn(name = "locality_id")
    private Locality locality;

    private Boolean active;
}
