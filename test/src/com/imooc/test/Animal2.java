package com.imooc.test;

public class Animal2 {
	
	private String name;
	private int month;
	

	public Animal2(){
		
	}
	public Animal2(String name,int month){
		this.setName(name);
		this.setMonth(month);
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj == null) {
			return false;
		}
		
		Animal2 temp = (Animal2)obj;
		
		//这个equals是String的相等判断使用
		if(this.getName().equals(temp.getName()) && this.getMonth() == temp.getMonth()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(Animal2 obj){

		if(obj == null){
			return false;
		}
		
		if(this.getName().equals(obj.getName()) && this.getMonth() == obj.getMonth()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return "昵称：" + this.getName() + ";年龄：" + this.getMonth();
	}

}
