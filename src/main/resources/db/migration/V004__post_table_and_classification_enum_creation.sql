CREATE TYPE classification AS ENUM ('REPORT', 'COMMENT', 'SUGGESTION', 'INFORMATIONAL');

CREATE TABLE tb_post (
    id                  UUID PRIMARY KEY NOT NULL,
    description         TEXT NOT NULL,
    creation_date       TIMESTAMP WITH TIME ZONE NOT NULL,
    update_date         TIMESTAMP WITH TIME ZONE NOT NULL,
    classification_type classification NOT NULL
);
