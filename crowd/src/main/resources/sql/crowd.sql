/*
Navicat MySQL Data Transfer

Source Server         : mysql_database
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : crowd

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2016-07-24 20:36:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_userinfo
-- ----------------------------
DROP TABLE IF EXISTS `t_userinfo`;
CREATE TABLE `t_userinfo` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `userName` varchar(255) DEFAULT '' COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_userinfo
-- ----------------------------
INSERT INTO `t_userinfo` VALUES ('1', 'test', '22');
INSERT INTO `t_userinfo` VALUES ('2', 'test2', '22');
