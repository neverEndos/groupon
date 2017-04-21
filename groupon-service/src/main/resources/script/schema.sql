CREATE DATABASE IF NOT EXISTS groupon2
  DEFAULT CHARACTER SET utf8;
USE groupon2;

-- 用户基础信息表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id`          INT(10)     NOT NULL AUTO_INCREMENT,
  `password`    VARCHAR(45) NOT NULL,
  `name`        VARCHAR(45) NOT NULL,
  `create_time` TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `login_time`  TIMESTAMP   NOT NULL,
  `update_time` TIMESTAMP   NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_UNIQUE` (`name`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT '用户基础信息表';

-- 用户信息表
DROP TABLE IF EXISTS `user_basic_info`;
CREATE TABLE `user_basic_info` (
  `id`          INT(10)     NOT NULL,
  `nick_name`   VARCHAR(32) NOT NULL,
  `real_name`   VARCHAR(32) NOT NULL,
  `mail`        VARCHAR(32) NOT NULL,
  `phone`       VARCHAR(16) NOT NULL,
  `create_time` TIMESTAMP   NOT NULL,
  `update_time` TIMESTAMP   NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT '用户信息表';
