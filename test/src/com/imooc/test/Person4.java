package com.imooc.test;

public abstract class Person4 {

	private String name;
	
	public Person4() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void read();
}
