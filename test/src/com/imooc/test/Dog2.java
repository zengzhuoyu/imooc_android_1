package com.imooc.test;

public class Dog2 extends Animal5 {
    //重写父类cry()方法：输出信息为“小狗的叫声：汪汪汪~~~”
	@Override
	public void cry() {
		System.out.println("小狗的叫声：汪汪汪~~~");
	}
}
