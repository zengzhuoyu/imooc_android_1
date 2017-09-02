package com.imooc.test;

class MyThread3 extends Thread{
	private String name;
	public MyThread3(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 1;i <= 10;i++) {
			System.out.println("线程" + name + "正在运行" + i);
		}
	}
}

public class Test37 {

	public static void main(String[] args) {
		
		

	}

}
