package com.imooc.test;

public class Cat extends Animal {

//	public int temp = 300;
	public int temp;
	
	static {
		System.out.println("子类的静态代码块");
	}
	
	{
		System.out.println("子类的构造代码块");
	}
	
	public Cat() {
		System.out.println("子类的无参构造方法");
	}
	
	public Cat(int temp) {
//		super(temp);//子类的构造函数自主选择调用父类的哪一个构造函数
		System.out.println("子类的有参构造方法");
	}		
	
}
