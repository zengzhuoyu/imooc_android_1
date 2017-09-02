package com.imooc.test;

/**
 * 用到抽象类和抽象方法 + 多态的向上继承
 * @author Administrator
 *
 */
public class Test14 {

	public static void main(String[] args) {
	    //创建类的实例，并分别对圆的半径和矩形的长宽进行赋值
		Shape circle = new Circle(3);
		Shape rectangle = new Rectangle(15,2);
		
		//调用area（）方法，输出结果
		System.out.println("圆的面积为：" + circle.area());
		System.out.println("矩形的面积为：" + rectangle.area());

	}

}
