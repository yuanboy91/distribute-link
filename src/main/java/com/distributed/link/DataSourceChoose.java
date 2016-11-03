package com.distributed.link;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * 数据库切换类
 * @author Yangyb
 * @date 2016年11月3日 下午5:13:14
 * @version V1.0
 */
public class DataSourceChoose {
	
	public void before(JoinPoint point) {
		try {
			MethodSignature methodSignature = (MethodSignature) point.getSignature();
			Method m = methodSignature.getMethod();
			if ((m != null) && (m.isAnnotationPresent(DataSource.class))) {
				DataSource data = (DataSource) m.getAnnotation(DataSource.class);
				JdbcContextHolder.clearJdbcType();
				JdbcContextHolder.setJdbcType(data.value().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
