package com.imooc.test;

public interface INet {
	
	void network();
	
	int TEMP = 20;
	
	default void connection() {
		System.out.println("我是接口中的默认链接");
	}
	
	static void stop() {
		System.out.println("我是接口中的静态方法");
	}
}
