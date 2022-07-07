CREATE TABLE tb_country (
    id   UUID PRIMARY KEY NOT NULL,
    name VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE tb_state (
    id         UUID PRIMARY KEY NOT NULL,
    name       VARCHAR(100) UNIQUE NOT NULL,
    country_id UUID NOT NULL
);

CREATE TABLE tb_city (
    id        UUID PRIMARY KEY NOT NULL,
    name      VARCHAR(100) UNIQUE NOT NULL,
    zip_code  VARCHAR(10) NOT NULL,
    state_id  UUID NOT NULL
);

CREATE TABLE tb_address (
    id        UUID PRIMARY KEY NOT NULL,
    address   VARCHAR(255) NOT NULL,
    city_id   UUID NOT NULL,
    user_id   UUID NOT NULL
);
