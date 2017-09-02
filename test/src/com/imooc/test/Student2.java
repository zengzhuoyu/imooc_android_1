package com.imooc.test;

public class Student2 {

	private int stuId;
	private String name;
	private float score;
	
	public Student2(int stuId, String name, float score) {
		this.stuId = stuId;
		this.name = name;
		this.score = score;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "[学号：" + stuId + ", 姓名：" + name + ", 成绩：" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + Float.floatToIntBits(score);
		result = prime * result + stuId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		//判断对象是否相等
		if(this == obj) {
			return true;
		}
		
		//判断obj是否是Student2类的对象
		if(obj.getClass() == Student2.class) {
			Student2 stu = (Student2)obj;
			return stu.getName().equals(name) &&
					stu.getStuId() == stuId;
		}
		
		return false;
	}
	
	
	
	
}
