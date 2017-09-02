package com.imooc.test;

//创建类Balloon并实现接口IFly
public class Ballon implements IFly{
    //重写fly方法
	@Override
	public void fly() {

		System.out.println("气球飞上天空");
	}
}
