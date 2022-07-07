ALTER TABLE tb_state
ADD CONSTRAINT country_id FOREIGN KEY(country_id) REFERENCES tb_country(id);

ALTER TABLE tb_city
ADD CONSTRAINT state_id FOREIGN KEY(state_id) REFERENCES tb_state(id);

ALTER TABLE tb_address
ADD CONSTRAINT city_id FOREIGN KEY(city_id) REFERENCES tb_city(id);

ALTER TABLE tb_address
ADD CONSTRAINT user_id FOREIGN KEY(user_id) REFERENCES tb_user(id);