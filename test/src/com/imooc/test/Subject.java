package com.imooc.test;

public class Subject {
	// 成员属性：学科名称、学科编号、学制年限、报名选修的学生信息、报名选修的学生个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	
	// 无参构造方法
	public Subject() {

	}
	
	// 带参构造，带参构造，实现对全部属性的赋值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	// 设置学制年限，限制必须>0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0)
			return;
		this.subjectLife = subjectLife;
	}
	
	
}
