package com.imooc.test;

public class Book {
	  //˽�����ԣ����������ߡ������硢�۸�
    	private String title;
    	private String auther;
    	private String push;
    	private double price;
    	
	  //ͨ�����췽��ʵ�����Ը�ֵ

	    /*ͨ�����е�get/set����ʵ�����Եķ��ʣ����У�
	    1���޶�ͼ��۸�������10�������Ч�������ʾ����ǿ�Ƹ�ֵΪ10
	    2���޶����ߡ�������Ϊֻ������
	    */
    	public Book(String title,String auther,String push,double price) {
    		this.title = title;
    		this.auther = auther;
    		this.setPush(push);
    		this.setPrice(price);
    	}

		public String getTitle() {
			return title;
		}

		public String getAuther() {
			return auther;
		}

		public String getPush() {
			return push;
		}

		public void setPush(String push) {
			this.push = push;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			if(price <= 10) {
				System.out.println("ͼ��۸�������10");
				this.price = 10;
			}else {
				this.price = price;
			}
			
		}
    	
	  //��Ϣ���ܷ���������ͼ��������Ϣ
		public void desc() {
			System.out.println("������" + this.title);
			System.out.println("���ߣ�" + this.auther);
			System.out.println("�����磺" + this.push);
			System.out.println("�۸�" + this.price);
		}
}