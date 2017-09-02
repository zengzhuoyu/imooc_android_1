package com.imooc.test;

class MyThread implements Runnable{
	
	@Override
	public void run() {
		for(int i = 1;i <= 15;i++) {
			System.out.println(Thread.currentThread().getName() + "执行第" + i + "次");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}	
}

public class Test35 {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		Thread t2 = new Thread(mt);
		t2.start();
	}

}
