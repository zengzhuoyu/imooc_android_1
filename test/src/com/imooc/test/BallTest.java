package com.imooc.test;

public class BallTest implements Ball{
    // ������Ա�ڲ���Inner_m
	class Inner_m implements Ball{
		
		@Override
		public void play() {
			System.out.println("��Ա�ڲ���:");
			System.out.println("������");
		}
	}

	// ���������ڲ���
	public void info() {
		class Inner_f implements Ball{
			
			@Override
			public void play() {
				System.out.println("*******\n�����ڲ���:\n��ƹ����");
			}
		}
		
		new Inner_f().play();
	}
	
	// ����һ������void playBall(Ball ball)������play()����
	public void playBall(Ball ball) {
		
		Ball.super.play();
	}
}
