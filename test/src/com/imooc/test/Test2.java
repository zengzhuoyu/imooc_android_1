package com.imooc.test;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.print("������Ϣ���ԣ�");
		Work work = new Work();
		System.out.println(work.work());
		
		System.out.print("���Թ�������Ϣ���ԣ�");
		TestWork testWork = new TestWork("���Թ���",1,2);
		System.out.println(testWork.work());
		
		System.out.print("�з���������Ϣ���ԣ�");
		DevelopmentWork developmentWork = new DevelopmentWork("�з�����",3,4);
		System.out.println(developmentWork.work());
	}

}