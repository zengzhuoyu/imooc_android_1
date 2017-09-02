package com.imooc.test;

public class Test38 {

	public static void main(String[] args) {
		
		// 创建帐户，给定余额为1000
		Bank bank=new Bank("s1001",1000);
		
		//创建线程对象
		SaveAccount sa=new SaveAccount(bank);
		DrawAccount da=new DrawAccount(bank);
		Thread save=new Thread(sa);
		Thread draw=new Thread(da);
		save.start();
		draw.start();
		
		try {
			draw.join();
			save.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bank);

	}

}
