package com.imooc.test;

class MyThread2 extends Thread{
	
	@Override
	public void run() {
		System.out.println(getName() + "正在执行");
	}
}

public class Test36 {

	public static void main(String[] args) {
		
		MyThread2 mt = new MyThread2();
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("主线程运行结束");

	}

}
