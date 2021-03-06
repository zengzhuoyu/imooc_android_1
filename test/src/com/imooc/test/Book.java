package com.imooc.test;

public class Book {
	  //私有属性：书名、作者、出版社、价格
    	private String title;
    	private String auther;
    	private String push;
    	private double price;
    	
	  //通过构造方法实现属性赋值

	    /*通过公有的get/set方法实现属性的访问，其中：
	    1、限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
	    2、限定作者、书名均为只读属性
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
				System.out.println("图书价格必须大于10");
				this.price = 10;
			}else {
				this.price = price;
			}
			
		}
    	
	  //信息介绍方法，描述图书所有信息
		public void desc() {
			System.out.println("书名：" + this.title);
			System.out.println("作者：" + this.auther);
			System.out.println("出版社：" + this.push);
			System.out.println("价格：" + this.price);
		}
}
