package com.imooc.test;

public class Base {

	//静态成员：
	//1.类加载时直接生成
	//2.所有对象共享：无论是对象访问方式还是类访问方式
	private static int x = 100;
	public static void main(String[] args) {
		
		Base hs1 = new Base();
		hs1.x++;
		Base hs2 = new Base();
		hs2.x++;
		hs1 = new Base();
		hs1.x++;
		Base.x--;
		System.out.println(x);

	}

}
