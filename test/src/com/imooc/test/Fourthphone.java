package com.imooc.test;

public class Fourthphone extends Thirdphone implements IPhoto,INet{
	
//	public void photo() {
//		System.out.println("�ֻ���������");
//	}
	
	@Override
	public void photo() {
		System.out.println("�ֻ���������");
	}
	
	public void network() {
		System.out.println("�ֻ���������");
	}	
	
	public void game() {
		System.out.println("�ֻ���������Ϸ");
	}	
	
	@Override
	public void connection() {
		System.out.println("����Fourthphone��connection");
	}
}
