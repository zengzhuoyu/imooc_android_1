package com.imooc.test;

public class HelloWorld {

	public static void main(String[] args) {
		
    	// ����int���ͱ�����ֵΪ100
		int score = 100; 
		// ����Integer��װ����󣬱�ʾ����score1��ֵ
//		Integer score1 = new Integer(score);//�ֶ�
//		��
		Integer score1 = score;//�Զ�
		
		// ��Integer��װ��ת��Ϊdouble����
		double d = score1.doubleValue();
		
		// ��Integer��װ��ת��ΪLong����
		Long l = score1.longValue();
		
		// ��Integer��װ��ת��Ϊint����
		int i = score1.intValue();//�ֶ�
		
		int ii = score1;//�Զ�
				
		//��ӡ���
		System.out.println("score��Ӧ��Integer���ͽ��Ϊ��" + i);
		System.out.println("score��Ӧ��double���ͽ��Ϊ��" + d);
		System.out.println("score��Ӧ��long���ͽ��Ϊ��" + l);
		System.out.println("������Integerת��Ϊint���͵Ľ��Ϊ��" + ii);
		
	}

}
