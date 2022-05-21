/*
 * DDL = Data Definition Language
 * Command lines from 'Saas-Sport-Club-DB' folder:
 * psql -h localhost -p 5432 -U postgres -d nandaparbat
 * \i schema.ddl.sql
 * \q
 */

DROP TABLE IF EXISTS roles CASCADE ;
DROP TABLE IF EXISTS players CASCADE ;
DROP TABLE IF EXISTS formats CASCADE ;
DROP TABLE IF EXISTS pairing_styles CASCADE ;
DROP TABLE IF EXISTS tournaments CASCADE ;
DROP TABLE IF EXISTS teams CASCADE ;

CREATE TABLE roles (
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    role_name VARCHAR(20) UNIQUE NOT NULL
);
-- table created

CREATE TABLE players (
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    fide_number INTEGER NOT NULL,
    elo INTEGER DEFAULT 1199,
    password VARCHAR(60) NOT NULL,
    username VARCHAR(255) UNIQUE NOT NULL,
    role_id INTEGER,
         CONSTRAINT fk_role_id
             FOREIGN KEY (role_id)
                  REFERENCES roles(id)
);
-- table created

CREATE TABLE formats (
 id SERIAL PRIMARY KEY UNIQUE NOT NULL,
 format_name VARCHAR(10) UNIQUE NOT NULL
);
-- table created

CREATE TABLE pairing_styles (
id SERIAL PRIMARY KEY UNIQUE NOT NULL,
pairing_style VARCHAR(50) UNIQUE NOT NULL
);
-- table created


CREATE TABLE tournaments (
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    tournament_name VARCHAR(255) UNIQUE NOT NULL,
    is_event BOOLEAN DEFAULT FALSE,
    date_of_start DATE NOT NULL,
    date_of_end DATE,
    number_of_rounds SMALLINT NOT NULL,
    format INTEGER NOT NULL,
    pairing_style INTEGER NOT NULL,
    organisator VARCHAR(255) NOT NULL,
    contact VARCHAR(255) NOT NULL,
    capacity INTEGER ,
    first_price INTEGER ,
    second_price INTEGER ,
    third_price INTEGER ,
    register_fee_senior SMALLINT,
    register_fee_junior SMALLINT,
    description VARCHAR(255) NOT NULL,
    CONSTRAINT fk_format_name
        FOREIGN KEY (format)
            REFERENCES formats(id),
    CONSTRAINT fk_pairing_style
        FOREIGN KEY (pairing_style)
            REFERENCES pairing_styles(id)
);
-- table created

CREATE TABLE teams (
    id SERIAL PRIMARY KEY NOT NULL,
    team_name VARCHAR(50) UNIQUE NOT NULL,
    elo_maximum_allowed INTEGER
);
-- table created



