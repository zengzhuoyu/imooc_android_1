package com.imooc.test;

public interface IFather {
	
	void say();
	
	default void connection() {
		System.out.println("IFather�е�connection");
	}
}
