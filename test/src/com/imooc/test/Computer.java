package com.imooc.test;

public abstract class Computer implements INet{
//	public void network() {
//		System.out.println("���Կ�������");
//	}	
	
	@Override
	public void network() {
		System.out.println("���Կ�������");
	}
	
	public void game() {
		System.out.println("���Կ�������Ϸ");
	}	
	
	public void video() {
		System.out.println("���Կ��Կ���Ƶ");
	}
	
	public void music() {
		System.out.println("���Կ���������");
	}		
}
