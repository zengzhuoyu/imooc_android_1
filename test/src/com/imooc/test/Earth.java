package com.imooc.test;

public class Earth {
    //����˽�й��췽�������ڹ��췽���д�ӡ�������������
	private Earth() {
		System.out.println("������");
	}
	
	 //����˽�о�̬��������ʵ����
	private static Earth instance = new Earth();
	
	 //���幫�о�̬�����������ڵ�˽�о�̬����
	public static Earth getInstance() {
		return instance;
	}
}