package com.imooc.test;

public class Test25 {

	public static void main(String[] args) {
        //����float���ͱ�������ֵΪ88.99
		float f1 = 88.99f;
		//����������ת��Ϊ�ַ���
		String str = Float.toString(f1);                            
		//��ӡ���
		System.out.println(str);
		//����String���ͱ�������ֵΪ"188.55"
		String str1 = "188.55";
	    // ���ַ���ת��Ϊ��������double
		double d = Double.parseDouble(str1);             
		//��ӡ���
		System.out.println(d);

	}

}
