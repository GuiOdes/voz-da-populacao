CREATE TABLE tb_user (
    id                      UUID PRIMARY KEY NOT NULL,
    name                    VARCHAR(255) NOT NULL,
    birth_date              DATE NOT NULL,
    cpf                     VARCHAR(15) NOT NULL UNIQUE,
    rg                      VARCHAR(15) NOT NULL UNIQUE,
    email                   VARCHAR(150) NOT NULL UNIQUE,
    profile_photo_reference VARCHAR(255) UNIQUE
);
