package com.imooc.test;

public class Person {
    //���ԣ�name��age��grade
	public String name;
	public int age;
	public char grade;

    //�����޲��޷���ֵ��student����������Ϊ������һ��ѧ����
	public void student() {
		System.out.println("����һ��ѧ����");
	}


    //�������Σ��Ա�sex����sex����������Ϊ������һ��**����
	public void sex(char sex) {
		System.out.println("����һ��" + sex + "����");
	}


    //�����޲��޷���ֵ��mySelf�������ֱ����������name�������䣨age�����꼶��grade��
	public void mySelf() {
		System.out.println("�ҽ�" + this.name + ",����" + this.age 
				+ "���ˣ���Сѧ" + this.grade + "�꼶�ˡ�");
	}
}