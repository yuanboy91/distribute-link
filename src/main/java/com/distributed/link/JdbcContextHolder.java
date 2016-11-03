package com.distributed.link;

/**
 * 设置、获取数据源连接
 * @author Yangyb
 * @date 2016年11月3日 下午5:14:20
 * @version V1.0
 */
public class JdbcContextHolder {
	
	private static final ThreadLocal<String> contextHolder = new ThreadLocal();

	public static void setSlave() {
		setJdbcType("slave");
	}

	public static void setMaster() {
		clearJdbcType();
	}

	public static void setJdbcType(String jdbcType) {
		contextHolder.set(jdbcType);
	}

	public static String getJdbcType() {
		return (String) contextHolder.get();
	}

	public static void clearJdbcType() {
		contextHolder.remove();
	}
	
}