package com.imooc.test;

public class Test21 implements Parent {

	@Override
	public int count(int i) {
		// TODO Auto-generated method stub
		return i % 9 ;
	}
	
	public static void main(String[] args) {
//		Test21 p = new Test21();
		
		//����ת�ͣ�����̳й�ϵ
		Parent p = new Test21();
		
		int i = p.count(20);
		
		System.out.println(i);
	}

}
