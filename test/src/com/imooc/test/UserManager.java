package com.imooc.test;

public class UserManager {
    // �û���Ϣ��֤�ķ���
    public String checkUser(User one, User two) {//
    	
    	//one��two���û����ж�֮ǰ��ü��Ϸǿ��ж�,���ⷢ����ָ�����
    	if(one == null || two == null) {
    		return "�û�����Ϊ��";
    	}
    	
    	//�ж��û����������Ƿ�Ϊ��
    	if(one.getUserName() == null || two.getUserName() == null) {//
    		return "�û�������Ϊ��";
    	}
    	
    	if(one.getPassWord() == null || two.getPassWord() == null) {
    		return "���벻��Ϊ��";
    	}
    	
       // �ж��û����������Ƿ�һ��
        if(one.getUserName().equals(two.getUserName())) {
        	if(!one.getPassWord().equals(two.getPassWord())) {
            	return "���벻һ��";
        	}        	

        }else {
        	return "�û�����һ��";
        }
        
        return "�û���Ϣһ��";

    }
}