package com.imooc.test;

public class Bicycle extends NonMotor{

	public Bicycle() {}
	
    // �ڹ��췽���е��ø����ι��죬������Ը�ֵ
	public Bicycle(String logo,String color) {
		super(logo,color);
	}
	
	// ��д���з�������������Ϊ������һ��**��ɫ�ģ�**�Ƶ����г�������**�������������ṩ
	public String work() {
		String str = "����һ��"+ super.getColor() +"��ɫ�ģ�"+ super.getLogo() 
					+"�Ƶ����г�";
		return str;
	}
}
