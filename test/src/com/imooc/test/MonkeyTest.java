package com.imooc.test;

public class MonkeyTest {

	public static void main(String[] args) {
	      //�����޲ι��췽��ʵ������
	      Monkey monkey1 = new Monkey();
	      //��ӡ�����������
	      System.out.println("����ʹ���޲ι�������ĺ��ӣ�");
	      System.out.println("���ƣ�" + monkey1.name);
	      System.out.println("������" + monkey1.feature);
	      //���ô��ι��췽��ʵ������
	      Monkey monkey2 = new Monkey("��ͷҶ��","ͷ���а�ë��ϲ������Ҷ"); 
	      //��ӡ�����������
	      System.out.println("����ʹ�ô��ι�������ĺ��ӣ�");
	      System.out.println("���ƣ�" + monkey2.name);
	      System.out.println("������" + monkey2.feature);
	}

}