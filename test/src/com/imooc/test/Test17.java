package com.imooc.test;

public class Test17 {

	public static void main(String[] args) {
		
		  //����ʵ����
        IFly plane = new Plane();
        IFly bird = new Bird();
        IFly ballon = new Ballon();

        //�ֱ����fly()����
        plane.fly();
        bird.fly();
        ballon.fly();

	}

}
