package com.imooc.test;

/**
 * �õ�������ͳ��󷽷� + ��̬�����ϼ̳�
 * @author Administrator
 *
 */
public class Test14 {

	public static void main(String[] args) {
	    //�������ʵ�������ֱ��Բ�İ뾶�;��εĳ�����и�ֵ
		Shape circle = new Circle(3);
		Shape rectangle = new Rectangle(15,2);
		
		//����area����������������
		System.out.println("Բ�����Ϊ��" + circle.area());
		System.out.println("���ε����Ϊ��" + rectangle.area());

	}

}
