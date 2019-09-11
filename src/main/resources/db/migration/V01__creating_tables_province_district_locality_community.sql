CREATE TABLE province(
province_id SERIAL,
province_name VARCHAR(50) NOT NULL,
active BOOLEAN DEFAULT false,
PRIMARY KEY(province_id)
);

CREATE TABLE district(
district_id BIGSERIAL NOT NULL,
district_name VARCHAR(50) NOT NULL,
province_id INTEGER NOT NULL,
active BOOLEAN DEFAULT false,
PRIMARY KEY(district_id),
CONSTRAINT fk_district_province
  FOREIGN KEY(province_id) REFERENCES province(province_id)
);


CREATE TABLE locality(
locality_id BIGSERIAL,
locality_name VARCHAR(100),
district_id BIGINT,
active BOOLEAN DEFAULT false,
PRIMARY KEY(locality_id),
CONSTRAINT fk_district_locality
     FOREIGN KEY(district_id) REFERENCES district(district_id)
);

CREATE TABLE community(
community_id BIGSERIAL,
community_name VARCHAR(100) NOT NULL,
locality_id BIGINT NOT NULL,
active BOOLEAN NOT NULL DEFAULT false,
PRIMARY KEY(community_id),
CONSTRAINT fk_community_locality
     FOREIGN KEY(locality_id) REFERENCES locality(locality_id)
);
