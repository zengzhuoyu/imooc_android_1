package com.imooc.test;

public class User {
    //���������û���������
    private String userName;
    private String passWord;
    
    public User(String userName,String passWord){
        this.setUserName(userName);
        this.setPassWord(passWord);
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getPassWord(){
        return this.passWord;
    }    
    
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }    
    
    public void printMess() {
    	System.out.println("�û�����" + this.getUserName());
    	System.out.println("���룺" + this.getPassWord());
    }
}