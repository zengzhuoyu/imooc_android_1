package com.imooc.test;

public class Dog extends Animal4{

	private String sex;
	
	public Dog() {}
	public Dog(String name,int month,String sex) {
		super(name,month);
		this.setSex(sex);
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void sleep() {
		System.out.println("Ğ¡¹·ÓĞÎçË¯µÄÏ°¹ß");
	}
	
	@Override
	public void eat() {
		System.out.println("¹·³ÔÈâ");
	}
}
