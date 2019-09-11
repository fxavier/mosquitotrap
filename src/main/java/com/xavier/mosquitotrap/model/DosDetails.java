package com.xavier.mosquitotrap.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

    @NotNull(message = "dos-1")
    @Column(name = "obs_date")
    private LocalDate observationDate;

    @NotNull(message = "dos-2")
    @Column(name = "mix_for75")
    private Boolean mixForMaking75;

    @NotNull(message = "dos-3")
    @Column(name = "triple_rinse_bottle")
    private Boolean tripleRinseBottle;

    @NotNull(message = "dos-4")
    @Column(name = "sop_full_ppe")
    private Boolean sopWithFullPPE;

    @NotNull(message = "dos-4")
    @Column(name = "sop_spray_flowcnt")
    private Boolean sopSprayFlowControl;

    @NotNull(message = "dos-5")
    @Column(name = "mobile_item_removed")
    private Boolean mobileItemRemoved;

    @NotNull(message = "dos-5")
    @Column(name = "imobile_item_covered")
    private Boolean imobileItemCovered;

    @NotNull(message = "dos-6")
    @Column(name = "leaks_pump")
    private Boolean leaksPump;

    @NotNull(message = "dos-7")
    @Column(name = "tip_nozzle_45wall")
    private Boolean tipNozzle45Wall;

    @NotNull(message = "dos-8")
    @Column(name = "correct_speed")
    private Boolean correctSpeed;

    @NotNull(message = "dos-9")
    @Column(name = "overlap_5cm")
    private Boolean overlap5Cm;

    @NotNull(message = "dos-10")
    @ManyToOne
    @JoinColumn(name = "sop_id")
    private Sop sop;

    @NotNull(message = "dos-11")
    @ManyToOne
    @JoinColumn(name = "team_leader_id")
    private TeamLeader teamLeader;

    @NotNull(message = "dos-12")
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;



}
