package com.imooc.test;

public class UserManager {
    // 用户信息验证的方法
    public String checkUser(User one, User two) {//
    	
    	//one和two的用户名判断之前最好加上非空判断,避免发生空指针错误
    	if(one == null || two == null) {
    		return "用户不能为空";
    	}
    	
    	//判断用户名、密码是否为空
    	if(one.getUserName() == null || two.getUserName() == null) {//
    		return "用户名不能为空";
    	}
    	
    	if(one.getPassWord() == null || two.getPassWord() == null) {
    		return "密码不能为空";
    	}
    	
       // 判断用户名、密码是否一致
        if(one.getUserName().equals(two.getUserName())) {
        	if(!one.getPassWord().equals(two.getPassWord())) {
            	return "密码不一致";
        	}        	

        }else {
        	return "用户名不一致";
        }
        
        return "用户信息一致";

    }
}
