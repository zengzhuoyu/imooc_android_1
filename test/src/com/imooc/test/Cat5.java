package com.imooc.test;

public class Cat5 {

	private String name;
	private int month;
	private String species;
	
	public Cat5(String name, int month, String species) {
		this.name = name;
		this.month = month;
		this.species = species;
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "[姓名：" + name + ", 年龄：" + month + ", 品种：" + species + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		//判断对象是否相等
		if(this == obj) {
			return true;
		}
		
		//判断obj是否是Cat5类的对象
		if(obj.getClass() == Cat5.class) {
			Cat5 cat = (Cat5)obj;
			return cat.getName().equals(name) &&
					cat.getMonth() == month &&
					cat.getSpecies().equals(species);
		}
		
		return false;
	}
	
	
	
	
}
