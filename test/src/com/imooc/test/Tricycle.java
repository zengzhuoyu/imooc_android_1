package com.imooc.test;

public class Tricycle extends NonMotor{
	
    // ���޲ι�����ʵ�ֶ���������ֵ�����޸�
	public Tricycle(){
		super.setWheelNum(3);
	}
	
	// ��д���з�������������Ϊ�����ֳ���һ����**�����ӵķǻ�����������**�������������ṩ
	public String work() {
		String str = "���ֳ���һ����"+ super.getWheelNum() +"�����ӵķǻ�������";
		return str;
	}	
}