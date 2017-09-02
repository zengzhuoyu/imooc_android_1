package com.imooc.test;

public class Test17 {

	public static void main(String[] args) {
		
		  //对象实例化
        IFly plane = new Plane();
        IFly bird = new Bird();
        IFly ballon = new Ballon();

        //分别调用fly()方法
        plane.fly();
        bird.fly();
        ballon.fly();

	}

}
