package com.imooc.test;

public interface INet {
	
	void network();
	
	int TEMP = 20;
	
	default void connection() {
		System.out.println("���ǽӿ��е�Ĭ������");
	}
	
	static void stop() {
		System.out.println("���ǽӿ��еľ�̬����");
	}
}
