package com.xavier.mosquitotrap.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dos_details")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DosDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "dos_id")
    private Long dosId;

    @Column(name = "obs_date")
    private LocalDate observationDate;

    @Column(name = "mix_for75")
    private Boolean mixForMaking75;

    @Column(name = "triple_rinse_bottle")
    private Boolean tripleRinseBottle;

    @Column(name = "sop_full_ppe")
    private Boolean sopWithFullPPE;

    @Column(name = "sop_spray_flowcnt")
    private Boolean sopSprayFlowControl;

    @Column(name = "mobile_item_removed")
    private Boolean mobileItemRemoved;

    @Column(name = "imobile_item_covered")
    private Boolean imobileItemCovered;

    @Column(name = "leaks_pump")
    private Boolean leaksPump;

    @Column(name = "tip_nozzle_45wall")
    private Boolean tipNozzle45Wall;

    @Column(name = "correct_speed")
    private Boolean correctSpeed;

    @Column(name = "overlap_5cm")
    private Boolean overlap5Cm;

    @ManyToOne
    @JoinColumn(name = "sop_id")
    private Sop sop;

    @ManyToOne
    @JoinColumn(name = "team_leader_id")
    private TeamLeader teamLeader;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;



}
