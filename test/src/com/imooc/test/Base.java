package com.imooc.test;

public class Base {

	//��̬��Ա��
	//1.�����ʱֱ������
	//2.���ж����������Ƕ�����ʷ�ʽ��������ʷ�ʽ
	private static int x = 100;
	public static void main(String[] args) {
		
		Base hs1 = new Base();
		hs1.x++;
		Base hs2 = new Base();
		hs2.x++;
		hs1 = new Base();
		hs1.x++;
		Base.x--;
		System.out.println(x);

	}

}
