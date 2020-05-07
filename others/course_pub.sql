/*
Navicat MySQL Data Transfer

Source Server         : 49.234.29.46
Source Server Version : 50562
Source Host           : 49.234.29.46:3306
Source Database       : relax

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-05-07 17:12:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course_pub
-- ----------------------------
DROP TABLE IF EXISTS `course_pub`;
CREATE TABLE `course_pub` (
  `id` char(32) NOT NULL COMMENT '主键(都是32位定长,因此使用char数据类型)',
  `name` varchar(32) NOT NULL COMMENT '课程名称',
  `users` varchar(500) NOT NULL COMMENT '适用人群',
  `first_level_tag` varchar(32) NOT NULL COMMENT '大分类',
  `second_level_tag` varchar(32) NOT NULL COMMENT '小分类',
  `grade` varchar(32) NOT NULL COMMENT '课程等级',
  `study_model` varchar(32) NOT NULL COMMENT '学习模式',
  `teach_mode` varchar(32) DEFAULT NULL COMMENT '教育模式',
  `description` text NOT NULL COMMENT '课程介绍',
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '时间戳logstash使用',
  `charge` varchar(32) NOT NULL COMMENT '收费规则，对应数据字典',
  `valid` varchar(32) NOT NULL COMMENT '有效性，对应数据字典',
  `qq` varchar(32) DEFAULT NULL COMMENT '咨询qq',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `price_old` decimal(10,2) DEFAULT NULL COMMENT '原价格',
  `expires` varchar(32) DEFAULT NULL COMMENT '过期时间',
  `start_time` varchar(32) DEFAULT NULL COMMENT '课程有效期-开始时间',
  `end_time` varchar(32) DEFAULT NULL COMMENT '课程有效期-结束时间',
  `pic` varchar(500) DEFAULT NULL COMMENT '课程图片',
  `teaching_plan` text NOT NULL COMMENT '课程计划',
  `pub_time` varchar(32) DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_pub
-- ----------------------------
