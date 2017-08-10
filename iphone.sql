/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50546
Source Host           : localhost:3306
Source Database       : iphone

Target Server Type    : MYSQL
Target Server Version : 50546
File Encoding         : 65001

Date: 2017-08-10 10:03:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` varchar(255) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `full_name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `sex` int(11) DEFAULT NULL COMMENT '性别(1:男0:女)',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `mobile` varchar(255) DEFAULT NULL COMMENT '手机号',
  `mobile_1` varchar(255) DEFAULT NULL COMMENT '备用手机号',
  `phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `email` varchar(255) DEFAULT NULL COMMENT '电子邮箱',
  `wechart` varchar(255) DEFAULT NULL COMMENT '微信号',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `flag` int(11) DEFAULT NULL COMMENT '1:有效0:无效',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` varchar(255) NOT NULL,
  `role_id` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
