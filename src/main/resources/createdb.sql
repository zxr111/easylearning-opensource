--
--

CREATE DATABASE IF NOT EXISTS easylearning CHARACTER SET utf8;

CREATE TABLE IF NOT EXISTS `user` (
  `userid` CHAR(32),
  `password` CHAR(32),
  `phone` CHAR(11),
  `username` VARCHAR(50),

  CONSTRAINT `user_pk` PRIMARY KEY (`userid`)
) CHARACTER SET utf8;

CREATE UNIQUE INDEX `user_phone_index` ON `user`(`phone`);

