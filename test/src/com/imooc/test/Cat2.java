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
		System.out.println("Ğ¡Ã¨¿ìÀÖµØ±¼ÅÜ");
	}
	
	@Override
	public void eat() {
		System.out.println("Ã¨³ÔÓã");
	}
	
	public static void say() {
		System.out.println("Ğ¡Ã¨ÅöºúĞë");
	}
	
	public void playBall() {
		System.out.println("Ğ¡Ã¨Ï²»¶ÍæÏßÇò");
	}
	
}
