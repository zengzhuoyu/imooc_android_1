package com.imooc.test;

public class Animal4 {
	private String name;
	private int month;
	
	public Animal4() {}
	public Animal4(String name,int month) {
		this.setName(name);
		this.setMonth(month);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void eat() {
		System.out.println("动物都有吃东西的能力");
	}
	
	public static void say() {
		System.out.println("动物间打招呼");
	}
	
	
}
