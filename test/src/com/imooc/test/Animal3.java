package com.imooc.test;

public class Animal3 {
	public String name;
	public int month;
	
	public Animal3() {
		
	}
	
	public void eat() {
		System.out.println(this.name+"�ڳԶ���");
	}
	
	public void help(final Animal3 temp) {
//		temp=new Animal();
		temp.name="ţţ";
		temp.eat();
}

}