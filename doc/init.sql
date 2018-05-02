CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '无关主键',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户唯一id标识',
  `user_name` varchar(50) NOT NULL DEFAULT '' COMMENT '用户昵称',
  `tel` varchar(20) NOT NULL DEFAULT '' COMMENT '用户绑定手机号',
  `type` tinyint(3) NOT NULL DEFAULT '0' COMMENT '用户类型\n',
  `status` tinyint(3) NOT NULL DEFAULT '0' COMMENT '用户状态',
  `added_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '添加时间',
  `modified_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='用户表';