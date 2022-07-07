ALTER TABLE tb_post
ADD COLUMN user_owner_id UUID NOT NULL;

ALTER TABLE tb_post
ADD CONSTRAINT user_owner_fk FOREIGN KEY(user_owner_id) REFERENCES tb_user(id);
