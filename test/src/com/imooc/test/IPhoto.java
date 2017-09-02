package com.imooc.test;

public interface IPhoto {
	
	//具有拍照的能力
	public void photo();
	
	default void connection() {
		System.out.println("我是IPhoto的connection");
	}	
	
}
