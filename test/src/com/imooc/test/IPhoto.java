package com.imooc.test;

public interface IPhoto {
	
	//�������յ�����
	public void photo();
	
	default void connection() {
		System.out.println("����IPhoto��connection");
	}	
	
}
