package com.imooc.test;

/**
 * ����ʽ
 * @author Administrator
 *
 */
public class Danli {

	//static����:������������ص�ʱ��������ˣ�����ͬһ���þ�̬���ε�����
	//���Ŀ�ģ�1.ֻ����һ��ʵ����2.���д���ʵ��
	private static Danli instance = new Danli();
	
	//���Ŀ�ģ�ֻ����һ��ʵ��
	private Danli() {}
	
	//���Ŀ�ģ�3.����������ϵͳ�ṩ���ʵ��
	public static Danli getInstance() {
		//��̬�����в�����this
		return instance;
	}
}
