package com.imooc.test;

public class Animal {
	
//	public int temp = 15;
	public int temp;
	
	static {
		System.out.println("父类的静态代码块");
	}
	
	{
		System.out.println("父类的构造代码块");
	}
	
	public Animal() {
		System.out.println("父类的无参构造方法");
	}
	
	public Animal(int temp) {
		System.out.println("父类的有参构造方法");
	}	
	
	
}
