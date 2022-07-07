ALTER TABLE tb_user_role
ADD CONSTRAINT user_id_fk
FOREIGN KEY(user_id) REFERENCES tb_user(id);

ALTER TABLE tb_user_role
ADD CONSTRAINT role_id_fk
FOREIGN KEY(role_id) REFERENCES tb_role(id);