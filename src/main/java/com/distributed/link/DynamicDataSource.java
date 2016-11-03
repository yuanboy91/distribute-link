package com.distributed.link;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 获取相关数据源连接
 * @author Yangyb
 * @date 2016年11月3日 下午5:14:58
 * @version V1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	
	protected Object determineCurrentLookupKey() {
		return JdbcContextHolder.getJdbcType();
	}
	
}
