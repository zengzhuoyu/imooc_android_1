package com.imooc.test;

public class DevelopmentWork extends Work{
    // ���ԣ���Ч����������Ŀǰû�н����Bug����
	private int userfulRow;
	private int existBugNum;
	
	public DevelopmentWork() {}
	
	//��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
	public DevelopmentWork(String name,int userfulRow,int existBugNum) {
		super(name);
		this.setUserfulRow(userfulRow);
		this.setExistBugNum(existBugNum);
	}
	
    // ���е�get***/set***����������Է�װ
	public int getUserfulRow() {
		return userfulRow;
	}

	public void setUserfulRow(int userfulRow) {
		this.userfulRow = userfulRow;
	}

	public int getExistBugNum() {
		return existBugNum;
	}

	public void setExistBugNum(int existBugNum) {
		this.existBugNum = existBugNum;
	}
	
	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**�д��룬Ŀǰ��Ȼ��**��bugû�н��������**�������������ṩ
	public String work() {
        String str = super.getName() + "���ձ��ǣ������д��" + this.getUserfulRow()
        + "�д��룬Ŀǰ��Ȼ��" + this.getExistBugNum() + "��bugû�н����";
        
        return str;
	}

}