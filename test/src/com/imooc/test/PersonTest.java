package com.imooc.test;

public class PersonTest {

	public static void main(String[] args) {
	      //使用new关键字实例化对象
			Person one = new Person();
			
	      //传入name、age、grade的参数值
			one.name = "李明";
			one.age = 10;
			one.grade = '五';
			
	      //分别调用student、sex、mySelf方法
			one.student();
			one.sex('女');
			one.mySelf();
	}

}