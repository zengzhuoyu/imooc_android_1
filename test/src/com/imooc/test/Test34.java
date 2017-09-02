package com.imooc.test;

class PrintRunnable implements Runnable{

	int i = 0;
	
	@Override
	public void run() {

		while(i <= 10){
			System.out.println(Thread.currentThread().getName() + "正在运行！" + (i++));
		}

	}
}

public class Test34 {

	public static void main(String[] args) {
		
		PrintRunnable pr = new PrintRunnable();
		Thread t = new Thread(pr);
		t.start();

//		PrintRunnable pr2 = new PrintRunnable();
		Thread t2 = new Thread(pr);
		t2.start();		
	}

}
