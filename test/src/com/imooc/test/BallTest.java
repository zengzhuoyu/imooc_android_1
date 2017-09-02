package com.imooc.test;

public class BallTest implements Ball{
    // 创建成员内部类Inner_m
	class Inner_m implements Ball{
		
		@Override
		public void play() {
			System.out.println("成员内部类:");
			System.out.println("打篮球");
		}
	}

	// 创建方法内部类
	public void info() {
		class Inner_f implements Ball{
			
			@Override
			public void play() {
				System.out.println("*******\n方法内部类:\n打乒乓球");
			}
		}
		
		new Inner_f().play();
	}
	
	// 定义一个方法void playBall(Ball ball)，调用play()方法
	public void playBall(Ball ball) {
		
		Ball.super.play();
	}
}
