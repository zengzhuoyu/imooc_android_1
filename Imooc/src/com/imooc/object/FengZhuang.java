package com.imooc.object;//定义包

public class FengZhuang {
	
	private String name;
	private int month;
	private double weight;
	private String species;
	
	/**
	 * 构造方法
	 */
	public FengZhuang() {
		
	}
	public FengZhuang(int month) {
//		this.month = month;
		this.setMonth(month);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return "我叫"+this.name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <= 0) {
			System.out.println("输入错误,年龄必须大于0");
		}else {
			this.month = month;
		}

	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	
}
