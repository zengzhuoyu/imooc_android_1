package com.imooc.test;

public class Person2 {
    //˽�����ԣ�name����������age(����)��sex���Ա�
    private String name;
    private int age;
    private char sex;
    
	public Person2() {

	}

    //���ι��췽����name��age��sexΪ������
	public Person2(String name,int age,char sex) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
	}

    //ͨ����װʵ�ֶ����Ե�get/set�����趨
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	
    //��дtoString��������ʾ��ʽΪ��������+**+  ���䣺+**+  �Ա�+**
	@Override
	public String toString() {
		
		String str = "������" + this.getName() +  " ���䣺" + this.getAge() 
					+  " �Ա�" + this.getSex();
		return str;
	}
}