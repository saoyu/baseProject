DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`                int8         NOT NULL AUTO_INCREMENT COMMENT '用户标识',
    `username`          varchar(64) NOT NULL COMMENT '用户名',
    `password`          varchar(64) NOT NULL COMMENT '密码',
    `nickname`          varchar(64) COMMENT '昵称',
    `icon`              varchar(128) COMMENT '图标',
    `gender`            varchar(1) COMMENT '性别',
    `birthday`          timestamp(6) COMMENT '生日',
    `province`          varchar(64) COMMENT '省',
    `city`              varchar(64) COMMENT '市',
    `county`            varchar(64) COMMENT '区',
    `address`           varchar(1024) COMMENT '地址',
    `qq`                varchar(64) COMMENT 'QQ',
    `phone`             varchar(64) COMMENT '手机号',
    `email`             varchar(128) COMMENT '邮箱',
    `id_card_number`    varchar(64) COMMENT '身份证号',
    `registe_date_time` timestamp(6) COMMENT '注册时间',
    `status`            char(1) COMMENT '状态',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;