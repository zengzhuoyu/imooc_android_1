package com.imooc.test;

public class Taxi extends Car{
    //˽�����ԣ�������˾( company)
	private String company;

	public Taxi(){
		
	}
	//���ø���Ĺ��췽����������Ը�ֵ
	public Taxi(String color,String userName,String company){
		super(color,userName);
		this.setCompany(company);
	}
	
    //ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//������������д��ride����������Ϊ��**���⳵��������***��˾�ġ�
	public final void ride() {
		System.out.println(this.getUserName() + "���⳵��������" 
				+ this.getCompany() + "��˾�ġ�");
	}

	//��д����use����������Ϊ�����⳵���������������������Ҫ����֮һ
	@Override
	public void use() {
		System.out.println("���⳵���������������������Ҫ����֮һ");
	}

	//��дtoString����������ı�����ʽ��ͬ�����color,userName��
	@Override
	public String toString() {
		String str = "taxi����Ϣ�ǣ�"+ this.getUserName() 
		+ "��һ����ɫ�ĳ��⳵";
		
		return str;

	}
}