package com.imooc.test;

//Ҫ��Waxberry�಻����������
public final class Waxberry extends Fruits{
  // ˽�����ԣ���ɫ��color��
  private String color;

	//�������췽������ɵ��ø���Ĺ��췽����������Ը�ֵ
  public Waxberry(String shape,String taste,String color){
	  super(shape,taste);
	  this.setColor(color);
  }

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
  
  //������������д��face����������Ϊ����÷��**��**����ζ��������
  public final String face() {
	  //��������������this����super���ǿ��еģ����õĶ��Ǹ����е�����
//	  String str = "��÷��" + this.getColor() + "��" + this.getShape() + "����ζ" + this.getTaste();
	  String str = "��÷��" + this.getColor() + "��" + super.getShape() + "����ζ" + super.getTaste();
	  
	  return str;
  }
  
  //��д����eat����������Ϊ����÷�������У��ǳ��óԣ�
  @Override
	public void eat() {
	  System.out.println("��÷�������У��ǳ��óԣ�");
	}
  
  //��дtoString����������ı�����ʽ��ͬ�����shape,color,taste��
  @Override
	public String toString() {

	  String str = "��÷����Ϣ����ʵΪ" + this.getShape() + "��" + this.getColor() 
	  				+ "��" + this.getTaste() + "���ǳ��óԣ�";
	  return str;
	}
}