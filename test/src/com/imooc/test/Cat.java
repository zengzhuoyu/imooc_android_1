package com.imooc.test;

public class Cat extends Animal {

//	public int temp = 300;
	public int temp;
	
	static {
		System.out.println("����ľ�̬�����");
	}
	
	{
		System.out.println("����Ĺ�������");
	}
	
	public Cat() {
		System.out.println("������޲ι��췽��");
	}
	
	public Cat(int temp) {
//		super(temp);//����Ĺ��캯������ѡ����ø������һ�����캯��
		System.out.println("������вι��췽��");
	}		
	
}