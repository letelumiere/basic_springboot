DROP TABLE `bulletin`;
DROP TABLE `comments`;

CREATE TABLE `bulletin` (
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
	`time_created`	TIMESTAMP DEFAULT NOW()	NULL
);

-- 게시판 조회 쿼리
SELECT * FROM bulletin;

INSERT INTO bulletin(title, contents, user, password, time_created) VALUES ("아무말", "아무 컨텐츠", "아무 유저", "아무번호", NOW());




SELECT title, views, user, time_created FROM bulletin;
SELECT title, views, user, time_created FROM bulletin ORDER BY time_created ASC;
SELECT title, views, user, time_created FROM bulletin WHERE user;

SELECT * FROM comments;
