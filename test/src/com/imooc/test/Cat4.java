package com.imooc.test;

public class Cat4 extends Animal6{
	private double weight;
	
	public Cat4() {}
	public Cat4(String name,int month,double weight) {
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
