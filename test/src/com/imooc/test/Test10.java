package com.imooc.test;

public class Test10 {

	public static void main(String[] args) {

		System.out.println("��һ�����򴴽��С�������");
		Earth one = Earth.getInstance();
		
		System.out.println("�ڶ������򴴽��С�������");
		Earth two = Earth.getInstance();
		
		System.out.println("���������򴴽��С�������");
		Earth three = Earth.getInstance();
		
		System.out.println("�ʣ�����������ͬһ��ô��");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}
