package com.imooc.test;

public class Banana extends Fruits{
    // ˽�����ԣ�Ʒ�֣�variety��
    private String variety;

    public Banana(){} 
    //�������ι��췽��Ϊ�������Ը�ֵ
    public Banana(String shape,String taste,String variety){
        this.setShape(shape);
        this.setTaste(taste);
    	this.setVariety(variety);
    }
    
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
    
    //�����޲��޷���ֵ��advantage����������Ϊ��**����**,�������𣬿ɹ���ʳ��
    public void advantage() {
    	System.out.println(this.getVariety() + "����" + this.getShape() + "������" 
    			+ this.getTaste() + "���ɹ���ʳ��");
    }
    
    //��������advantage������������color��������Ϊ��**��ɫΪ**
    public void advantage(String color) {
    	System.out.println(this.getVariety() + "��ɫΪ" + color);
    }
}