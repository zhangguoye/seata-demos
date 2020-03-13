/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80012
Source Host           : 127.0.0.1:3306
Source Database       : seata-libsys

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2020-03-13 22:47:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seata_reader
-- ----------------------------
DROP TABLE IF EXISTS `seata_reader`;
CREATE TABLE `seata_reader` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reader_cert` varchar(50) DEFAULT NULL,
  `reader_name` varchar(255) DEFAULT NULL,
  `count` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of seata_reader
-- ----------------------------
INSERT INTO `seata_reader` VALUES ('1', 'B101', '张三', '10');

-- ----------------------------
-- Table structure for seata_record
-- ----------------------------
DROP TABLE IF EXISTS `seata_record`;
CREATE TABLE `seata_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reader_cert` varchar(50) DEFAULT NULL,
  `barcode` varchar(20) DEFAULT NULL,
  `borrow_date` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of seata_record
-- ----------------------------
INSERT INTO `seata_record` VALUES ('1', '1', '232112', '2020-03-12 15:05:12', '0');

-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) NOT NULL,
  `context` varchar(128) NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime NOT NULL,
  `log_modified` datetime NOT NULL,
  `ext` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of undo_log
-- ----------------------------
