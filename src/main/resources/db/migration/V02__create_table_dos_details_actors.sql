CREATE TABLE sop(
sop_id BIGSERIAL,
sop_code BIGINT NOT NULL,
sop_name VARCHAR(100),
district_id BIGINT NOT NULL,
active BOOLEAN DEFAULT true,
PRIMARY KEY(sop_id),
CONSTRAINT fk_sop_district
  FOREIGN KEY(district_id) REFERENCES district(district_id)
);

CREATE TABLE team_leader(
team_leader_id BIGSERIAL,
team_leader_code BIGINT NOT NULL,
team_leader_name VARCHAR(100),
district_id BIGINT NOT NULL,
active BOOLEAN DEFAULT true,
PRIMARY KEY(team_leader_id),
CONSTRAINT fk_tl_district
  FOREIGN KEY(district_id) REFERENCES district(district_id)
);


CREATE TABLE dos_details (
    dos_id BIGSERIAL,
    obs_date DATE NOT NULL,
    mix_for75 VARCHAR(20) NOT NULL,
    triple_rinse_bottle VARCHAR(20) NOT NULL,
    sop_full_ppe VARCHAR(20) NOT NULL,
    SOPPulvComBombaComCntFluxo VARCHAR(20) NOT NULL,
    mobile_item_removed VARCHAR(20) NOT NULL,
    imobile_item_removed VARCHAR(20) NOT NULL,
    leaks_pump VARCHAR(20) NOT NULL,
    tip_nozzle_45wall VARCHAR(20) NOT NULL,
    correct_speed VARCHAR(20) NOT NULL,
    overlap_5cm VARCHAR(20),
    sop_id BIGINT NOT NULL,
    district_id BIGINT NOT NULL,
    team_leader_id BIGINT NOT NULL,
    PRIMARY KEY(dos_id),
    CONSTRAINT fk_dos_sop
      FOREIGN KEY(sop_id) REFERENCES sop(sop_id),
    CONSTRAINT fk_dos_district
       FOREIGN KEY(district_id) REFERENCES district(district_id),
    CONSTRAINT fk_dos_team_leader
       FOREIGN KEY(team_leader_id) REFERENCES team_leader(team_leader_id)
   );