package com.imooc.test;

public class StringUse {

	public static void main(String[] args) {
		double a = 12.5;
		//����������ת��Ϊ�ַ���
		String str1 = Double.toString(a) + 10;       
		System.out.println("a ת��ΪString�ͺ�+10�Ľ��Ϊ�� "+str1);		
		
		String str = "2.8";
		// ���ַ���ת��Ϊ��������
		Double b = Double.valueOf(str) + 10;
        System.out.println("str ת��Ϊdouble�ͺ�+10�Ľ��Ϊ�� "+b);
	}

}
