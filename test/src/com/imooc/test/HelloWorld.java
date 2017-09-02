package com.imooc.test;

public class HelloWorld {

	public static void main(String[] args) {
		
    	// 定义int类型变量，值为100
		int score = 100; 
		// 创建Integer包装类对象，表示变量score1的值
//		Integer score1 = new Integer(score);//手动
//		或
		Integer score1 = score;//自动
		
		// 将Integer包装类转换为double类型
		double d = score1.doubleValue();
		
		// 将Integer包装类转换为Long类型
		Long l = score1.longValue();
		
		// 将Integer包装类转换为int类型
		int i = score1.intValue();//手动
		
		int ii = score1;//自动
				
		//打印输出
		System.out.println("score对应的Integer类型结果为：" + i);
		System.out.println("score对应的double类型结果为：" + d);
		System.out.println("score对应的long类型结果为：" + l);
		System.out.println("重新由Integer转换为int类型的结果为：" + ii);
		
	}

}
