package com.imooc.test;

public class Circle extends Shape{
    //���ԣ�Բ�İ뾶r
	private double r;
	
    //�������ι��췽���Լ��޲ι��췽��
     public Circle() {}
     public Circle(double r) {
    	 this.setR(r);
     }
     
    //������԰뾶�ĸ�ֵ��ȡֵ����
 	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	//��д������area()����
	@Override
	public double area() {

		return 3.14 * this.getR() * this.getR();
	}
}
