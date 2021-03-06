package com.imooc.test;

/**
 * 饿汉式
 * @author Administrator
 *
 */
public class Danli {

	//static作用:该属性在类加载的时候就生成了，共享同一个该静态修饰的属性
	//达成目的：1.只能有一个实例；2.自行创建实例
	private static Danli instance = new Danli();
	
	//达成目的：只能有一个实例
	private Danli() {}
	
	//达成目的：3.自行向整个系统提供这个实例
	public static Danli getInstance() {
		//静态方法中不能用this
		return instance;
	}
}
