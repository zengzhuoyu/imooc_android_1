package com.imooc.object;//�����

public class FengZhuang {
	
	private String name;
	private int month;
	private double weight;
	private String species;
	
	/**
	 * ���췽��
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
		
		return "�ҽ�"+this.name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <= 0) {
			System.out.println("�������,����������0");
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