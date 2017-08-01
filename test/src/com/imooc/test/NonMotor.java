package com.imooc.test;

public class NonMotor {
    // ˽�����ԣ�Ʒ�ơ���ɫ������(Ĭ��2��)�����Σ�Ĭ�� 1����
	private String logo;
	private String color;
	private int wheelNum = 2;
	private int chairNum = 1;
	
	// �޲ι��췽��
	public NonMotor() {}
	// ˫�ι��췽������ɶ�Ʒ�ƺ���ɫ�ĸ�ֵ
	public NonMotor(String logo,String color) {
		this.setLogo(logo);
		this.setColor(color);
	}
	
	// �Ĳι��췽�����ֱ���������Ը�ֵ
	public NonMotor(String logo,String color,int wheelNum,int chairNum) {
		this.setLogo(logo);
		this.setColor(color);
		this.setWheelNum(wheelNum);
		this.setChairNum(chairNum);
	}
	
   // ���е�get***/set***����������Է�װ
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheelNum() {
		return wheelNum;
	}
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}
	public int getChairNum() {
		return chairNum;
	}
	public void setChairNum(int chairNum) {
		this.chairNum = chairNum;
	}
	
	// ���������У���������Ϊ������һ��**��ɫ�ģ�**�Ƶķǻ���������**�����ӣ���**�����εķǻ�����������**�������������ṩ
	public String work() {
		String str = "����һ��"+ this.getColor() +"��ɫ�ģ�"+ this.getLogo() 
					+"�Ƶķǻ���������"+ this.getWheelNum() 
					+"�����ӣ���"+ this.getChairNum() +"�����Ρ�";
		return str;
	}

}