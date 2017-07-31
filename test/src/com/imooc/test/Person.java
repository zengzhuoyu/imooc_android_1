package com.imooc.test;

public class Person {
    //属性：name、age、grade
	public String name;
	public int age;
	public char grade;

    //创建无参无返回值的student方法，描述为：我是一名学生！
	public void student() {
		System.out.println("我是一名学生！");
	}


    //创建带参（性别sex）的sex方法，描述为：我是一个**孩！
	public void sex(char sex) {
		System.out.println("我是一个" + sex + "孩！");
	}


    //创建无参无返回值的mySelf方法，分别介绍姓名（name），年龄（age），年级（grade）
	public void mySelf() {
		System.out.println("我叫" + this.name + ",今年" + this.age 
				+ "岁了，读小学" + this.grade + "年级了。");
	}
}
