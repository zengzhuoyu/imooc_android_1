package com.imooc.test;

public class Work {
    // ���ԣ�������
    private String name;
    
	// �޲ι��췽��
    public Work() {
    	
    }
    
	// ���ι��췽������ɹ������͵ĸ�ֵ
    public Work(String name) {
    	this.setName(name);    	
    }
    
   // ���е�get***/set***����������Է�װ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// ������������������������Ϊ�����Ĺ���
	public String work() {
		
		return "���Ĺ���";
	}	
}