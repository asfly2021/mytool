create table mytool_app (
	id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'app标识',
	name VARCHAR(40) COMMENT 'app名称',
	route VARCHAR(200) COMMENT '路由',
	remark VARCHAR(200) COMMENT '描述',
	create_time DATE COMMENT '创建时间',
	modify_time DATE COMMENT '修改时间'
) COMMENT='工具应用表';