package com.imooc.test;

public class Test18 {

	public static void main(String[] args) {
		
		Person3 lili = new Person3();
		lili.age = 12;
		
//		Person3.Heart myHeart = new Person3().new Heart();
//		System.out.println(myHeart.beat());
//		
//		myHeart = lili.new Heart();
//		System.out.println(myHeart.beat());
//
//		myHeart = lili.getHeart();
//		System.out.println(myHeart.beat());		
		
//		//获取静态内部类对象实例
//		Person3.Heart myHeart = new Person3.Heart();
//		System.out.println(myHeart.beat());
//		
//		Person3.Heart.say();
		
		System.out.println(lili.getHeart());
	}

}
