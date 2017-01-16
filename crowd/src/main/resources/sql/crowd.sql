/*
Navicat MySQL Data Transfer

Source Server         : ex02
Source Server Version : 50146
Source Host           : localhost:3306
Source Database       : crowd

Target Server Type    : MYSQL
Target Server Version : 50146
File Encoding         : 65001

Date: 2017-01-05 17:21:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `t_userinfo`;
CREATE TABLE `t_userinfo` (
  `id` bigint(20) NOT NULL DEFAULT '0',
  `userId` int(11) NOT NULL COMMENT '用户主键',
  `userName` varchar(255) DEFAULT '' COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_userinfo
-- ----------------------------
INSERT INTO `t_userinfo` VALUES ('0', '1', 'test', '23');
INSERT INTO `t_userinfo` VALUES ('1', '2', 'test2', '22');
INSERT INTO `t_userinfo` VALUES ('2', '3', '测试', '23');
INSERT INTO `t_userinfo` VALUES ('816574730398203904', '1', 'test5', '222');
