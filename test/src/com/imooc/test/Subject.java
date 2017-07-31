package com.imooc.test;

public class Subject {
	// ��Ա���ԣ�ѧ�����ơ�ѧ�Ʊ�š�ѧ�����ޡ�����ѡ�޵�ѧ����Ϣ������ѡ�޵�ѧ������
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	
	// �޲ι��췽��
	public Subject() {

	}
	
	// ���ι��죬���ι��죬ʵ�ֶ�ȫ�����Եĸ�ֵ
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

	// ����ѧ�����ޣ����Ʊ���>0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0)
			return;
		this.subjectLife = subjectLife;
	}
	
	
}