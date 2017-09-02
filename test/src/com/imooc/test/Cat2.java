package com.imooc.test;

public class Cat2 extends Animal4{
	private double weight;
	
	public Cat2() {}
	public Cat2(String name,int month,double weight) {
		super(name,month);
		this.setWeight(weight);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void run() {
		System.out.println("Сè���ֵر���");
	}
	
	@Override
	public void eat() {
		System.out.println("è����");
	}
	
	public static void say() {
		System.out.println("Сè������");
	}
	
	public void playBall() {
		System.out.println("Сèϲ��������");
	}
	
}
