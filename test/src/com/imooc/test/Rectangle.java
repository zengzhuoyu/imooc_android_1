package com.imooc.test;

public class Rectangle extends Shape{
    //���ԣ����εĳ�lenghth����wide
	private double length;
	private double wide;
	
	//�������ι��췽���Լ��޲ι��췽��
	public Rectangle() {}
	public Rectangle(double length,double wide) {
		this.setLength(length);
		this.setWide(wide);
	}
	
    //������Գ�����ĸ�ֵ��ȡֵ����
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWide() {
		return wide;
	}
	public void setWide(double wide) {
		this.wide = wide;
	}
	
	//��д�����area��������
	@Override
	public double area() {
		
		return (this.getLength() * this.getWide());
	}

}
