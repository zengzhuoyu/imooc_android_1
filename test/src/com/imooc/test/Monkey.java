package com.imooc.test;

public class Monkey {
    //���ԣ�������name����������feature��
    public String name;
    public String feature;

    //�޲εĹ��췽����Ĭ�ϳ�ʼ��name��feature������ֵ������ֵ�ο�Ч��ͼ��
    public Monkey() {
    	this.name = "��β��";
    	this.feature = "β�ͳ�";
    }
    

    //���εĹ��췽���������ⲿ����Ĳ������ֱ��� name �� feature ��ֵ��
    public Monkey(String name,String feature) {
    	this.name = name;
    	this.feature = feature;
    }    
}
