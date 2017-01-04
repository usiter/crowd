/*
Navicat MySQL Data Transfer

Source Server         : ex02
Source Server Version : 50146
Source Host           : localhost:3306
Source Database       : crowd

Target Server Type    : MYSQL
Target Server Version : 50146
File Encoding         : 65001

Date: 2017-01-04 17:29:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_proinfo`
-- ----------------------------
DROP TABLE IF EXISTS `t_proinfo`;
CREATE TABLE `t_proinfo` (
  `PROID` varchar(32) NOT NULL COMMENT '项目编号',
  `TE_OPERID` varchar(32) DEFAULT NULL COMMENT '用户编号',
  `PRONAME` varchar(100) DEFAULT NULL COMMENT '项目名称',
  `PRORECOLOGO` varchar(200) DEFAULT NULL COMMENT '项目广告图',
  `PROLOGO` varchar(200) DEFAULT NULL COMMENT '项目推荐图',
  `CIRIMG` varchar(200) DEFAULT NULL COMMENT '项目轮播图',
  `PROMAXLOGO` varchar(200) DEFAULT NULL COMMENT '项目推荐大图',
  `CATEGORY` varchar(8) DEFAULT NULL COMMENT '项目类型',
  `PROINTRODUCE` varchar(500) DEFAULT NULL COMMENT '项目简介',
  `PROMONEY` decimal(12,2) DEFAULT NULL COMMENT '项目目标金额',
  `PREDAYS` int(11) DEFAULT '0' COMMENT '预热天数',
  `PRODISTINCT` varchar(20) DEFAULT NULL COMMENT '项目实施地区',
  `PROVILLAGE` varchar(100) DEFAULT NULL COMMENT '筹资对象小区',
  `SUBMITDATE` varchar(8) DEFAULT NULL COMMENT '提交日期',
  `SUBMITTIME` varchar(10) DEFAULT NULL COMMENT '提交时间',
  `AUDITDATE` varchar(8) DEFAULT NULL COMMENT '审核日期',
  `AUDITTIME` varchar(8) DEFAULT NULL COMMENT '审核时间',
  `PROSTARTDATE` varchar(8) DEFAULT NULL COMMENT '开始日期',
  `PROSTARTTIME` varchar(10) DEFAULT NULL COMMENT '开始时间',
  `PROENDDATE` varchar(8) DEFAULT NULL COMMENT '结束日期',
  `PROENDTIME` varchar(10) DEFAULT NULL COMMENT '结束时间',
  `PRODETAILS` varchar(1000) DEFAULT NULL COMMENT '项目详细介绍',
  `PROEXESTATUS` varchar(8) DEFAULT NULL COMMENT '项目状态',
  `RESID` varchar(32) DEFAULT NULL COMMENT '附件序号',
  `ISRECOMMEND` varchar(8) DEFAULT NULL COMMENT '是否推广',
  `MODDATE` varchar(8) DEFAULT NULL COMMENT '修改日期',
  `MODTIME` varchar(14) DEFAULT NULL COMMENT '修改时间',
  `MODIFIER` varchar(14) DEFAULT NULL COMMENT '修改人',
  `FAVOURITES` int(11) DEFAULT '0' COMMENT '收藏数',
  `REMARK` varchar(200) DEFAULT NULL COMMENT '个人信息简介',
  `GEN_TOU_TOTAL` int(11) DEFAULT '0' COMMENT '项目跟投人数',
  `SHENG_YU_DAYS` int(11) DEFAULT '0' COMMENT '剩余天数',
  `CHO_JI_AMT` decimal(12,2) DEFAULT NULL COMMENT '已筹集金额',
  `PREENDDATE` varchar(10) DEFAULT NULL COMMENT '预热结束日期',
  `PREENDDAYS` int(11) DEFAULT '0' COMMENT '预热剩余天数',
  `LOOKSTATUS` varchar(10) DEFAULT NULL COMMENT '项目查看状态',
  `is_delete` varchar(10) DEFAULT NULL COMMENT '是否逻辑删除 0或空 删除    1未删除',
  PRIMARY KEY (`PROID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_proinfo
-- ----------------------------

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
