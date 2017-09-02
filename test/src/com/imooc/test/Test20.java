package com.imooc.test;

public class Test20 {
	
	public void getPlay(BallTest ballTest) {
		ballTest.play();
	}
	
	public static void main(String[] args) {
		//完成成员内部类内部测试
		BallTest.Inner_m inner_m = new BallTest().new Inner_m();
		inner_m.play();
		
		//完成方法内部类测试
		BallTest ballTest = new BallTest();
		ballTest.info();
		
		//完成匿名内部类测试
		Test20 test = new Test20();
		test.getPlay(new BallTest() {//
			
			@Override
			public void play() {
				System.out.println("*******\n匿名内部类:\n打排球");
			}
		});
		
		
		
	}


}
