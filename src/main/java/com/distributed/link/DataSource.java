package com.distributed.link;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解类
 * @author Yangyb
 * @date 2016年11月3日 下午5:12:41
 * @version V1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.METHOD })
@Documented
public @interface DataSource {
	
	public abstract DataSourceType value();
	
}
