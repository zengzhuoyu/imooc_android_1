package com.imooc.test;

public class Test11 {

	public static void main(String[] args) {
		System.out.println("����1�Żʵ۶���");
		Emperor one = Emperor.getInstance();
		
		System.out.println("����2�Żʵ۶���");
		Emperor two = Emperor.getInstance();
		
		System.out.println("����3�Żʵ۶���");
		Emperor three = Emperor.getInstance();
		
		System.out.println("�����ʵ۶��������ǣ�");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}