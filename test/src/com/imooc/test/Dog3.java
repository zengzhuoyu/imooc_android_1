package com.imooc.test;

public class Dog3 extends Animal6{

	private String sex;
	
	public Dog3() {}
	public Dog3(String name,int month,String sex) {
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
		System.out.println("С������˯��ϰ��");
	}
	
	@Override
	public void eat() {
		System.out.println("������");
	}
}
