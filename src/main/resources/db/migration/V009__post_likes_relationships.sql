ALTER TABLE tb_post_likes
ADD CONSTRAINT user_id FOREIGN KEY(user_id) REFERENCES tb_user(id);

ALTER TABLE tb_post_likes
ADD CONSTRAINT post_id FOREIGN KEY(post_id) REFERENCES tb_post(id);
