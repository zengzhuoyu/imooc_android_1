package com.imooc.test;

public class Test7 {

	public static void main(String[] args) {
		// ʵ����2��������󣬴���������ͬ�Ĳ���ֵ
		Fruits fru1 = new Fruits("Բ��","����"); 
		Fruits fru2 = new Fruits("Բ��","����"); 

		// ���ø���eat����
		fru1.eat();

		// ������дequals�������ж����������Ƿ����
		boolean flag = fru1.equals(fru2);
		System.out.println("fru1��fru2�����ñȽϣ�" + flag);

	System.out.println("��������������������������������������������������������������������������������");
		// ʵ����������󣬲�������ز���ֵ
		Waxberry waxberry = new Waxberry("Բ��","��������","�Ϻ�ɫ");

		// ��������face������eat����
		System.out.println(waxberry.face());
		waxberry.eat();
		
		// ������дtoString�������������������Ϣ
		System.out.println(waxberry);

		System.out.println("��������������������������������������������������������������������������������������������");
		// ʵ����Banana����󣬲�������ز���ֵ
		Banana banana = new Banana("�̶���Բ","����","���˽�");

		// ���������advantage���������ط���
		banana.advantage();
		banana.advantage("��ɫ");

	}

}