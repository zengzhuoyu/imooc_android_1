package com.imooc.test;

public class Test20 {
	
	public void getPlay(BallTest ballTest) {
		ballTest.play();
	}
	
	public static void main(String[] args) {
		//��ɳ�Ա�ڲ����ڲ�����
		BallTest.Inner_m inner_m = new BallTest().new Inner_m();
		inner_m.play();
		
		//��ɷ����ڲ������
		BallTest ballTest = new BallTest();
		ballTest.info();
		
		//��������ڲ������
		Test20 test = new Test20();
		test.getPlay(new BallTest() {//
			
			@Override
			public void play() {
				System.out.println("*******\n�����ڲ���:\n������");
			}
		});
		
		
		
	}


}
