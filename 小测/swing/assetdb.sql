/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.106.138
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : 192.168.106.138:3306
 Source Schema         : assetdb

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 28/06/2019 09:24:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for T_asset
-- ----------------------------
DROP TABLE IF EXISTS `T_asset`;
CREATE TABLE `T_asset`  (
  `aid` int(4) NOT NULL AUTO_INCREMENT COMMENT '资产编号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '名称',
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '型号',
  `amount` int(255) NULL DEFAULT NULL COMMENT '数量',
  `inspectTime` date NULL DEFAULT NULL COMMENT '检查时间',
  `remark` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`aid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of T_asset
-- ----------------------------
INSERT INTO `T_asset` VALUES (1, '电脑', '方正', 47, '2019-04-25', '3个不可用');
INSERT INTO `T_asset` VALUES (2, '投影仪', '索尼', 13, '2019-05-15', '全部可用');

SET FOREIGN_KEY_CHECKS = 1;
