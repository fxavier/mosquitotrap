package com.xavier.mosquitotrap.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "team_leader")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TeamLeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "team_leader_id")
    private Long TeamLeaderId;

    @Column(name = "team_leader_code")
    private String teamLeaderCode;

    @Column(name = "team_leader_name")
    private String teamLeaderName;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private  District district;

    private Boolean active;
}
