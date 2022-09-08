DROP TABLE `bulletin`;
DROP TABLE `comments`;

CREATE TABLE `bulletin` (
	`id` long	NOT NULL,
	`title`	VARCHAR(255)	NULL,
	`user`	VARCHAR(255)	NULL,
	`password`	VARCHAR(255)	NULL,
	`contents`	VARCHAR(255)	NULL,
	`views`	VARCHAR(255)	NULL,
	`created_time`	TIMESTAMP NULL,
    `modified_time`	TIMESTAMP NULL,
    `deleted_time`	TIMESTAMP NULL
);

CREATE TABLE `comments` (
	`id`	VARCHAR(255)	NULL,
	`title`	VARCHAR(255)	NULL,
	`contents`	VARCHAR(255)	NULL,
	`user`	VARCHAR(255)	NULL,
	`password`	VARCHAR(255)	NULL,
	`created_time`	TIMESTAMP DEFAULT NOW()	NULL
);

-- 게시판 조회 쿼리
SELECT * FROM bulletin;

INSERT INTO bulletin(id, title, contents, user, password, created_time) VALUES (0, "아무말", "아무 컨텐츠", "아무 유저", "아무번호", now());




SELECT title, views, user, created_time FROM bulletin;
SELECT title, views, user, created_time FROM bulletin ORDER BY created_time ASC;
SELECT title, views, user, created_time FROM bulletin WHERE user;

SELECT * FROM comments;
