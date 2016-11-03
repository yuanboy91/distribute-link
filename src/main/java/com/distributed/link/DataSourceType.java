package com.distributed.link;

/**
 * 枚举类
 * @author Yangyb
 * @date 2016年11月3日 下午5:13:43
 * @version V1.0
 */
public enum DataSourceType {
	
	Master("master"),

	Slave("slave");

	private String name;

	private DataSourceType(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
}
