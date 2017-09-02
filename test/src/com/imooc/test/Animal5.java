package com.imooc.test;

public class Animal5 {
    //属性：kind(种类)
	private String kind;
	
	public Animal5(){
		
	}
	
	//创建带参（king为参数）构造函数
	public Animal5(String kind){
		this.setKind(kind);
	}

    //应用封装实现对私有属性的get/set操作
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	//创建成员方法cry():void
	public void cry() {
		
	}
}
