package com.imooc.test;

public class Emperor {
    //����˽�й��췽��
	private Emperor() {}
	 //����˽�о�̬�����
	private static Emperor instance = null;
	
	 //���幫�о�̬�����������ڵ�˽�о�̬����
	public static Emperor getInstance() {
		if(instance == null) {
			instance  = new Emperor();
		}
		
		return instance;
	}
}