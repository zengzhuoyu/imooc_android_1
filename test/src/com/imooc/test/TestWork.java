package com.imooc.test;

public class TestWork extends Work{
    //���ԣ���д�Ĳ����������������ֵ�Bug����
	private int exampleNum;
	private int bugNum;
	
	public TestWork() {}
	
    // ��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
	public TestWork(String name,int exampleNum,int bugNum) {
		super(name);
		this.setExampleNum(exampleNum);
		this.setBugNum(bugNum);
	}
	
    // ���е�get***/set***����������Է�װ
	public int getExampleNum() {
		return exampleNum;
	}

	public void setExampleNum(int exampleNum) {
		this.exampleNum = exampleNum;
	}

	public int getBugNum() {
		return bugNum;
	}

	public void setBugNum(int bugNum) {
		this.bugNum = bugNum;
	}
	
	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**������������������**bug������**�������������ṩ
	public String work() {
        String str = super.getName() + "���ձ��ǣ������д��" + this.getExampleNum()
        + "������������������" + this.getBugNum() + "bug��";
        
        return str;
	}


}
