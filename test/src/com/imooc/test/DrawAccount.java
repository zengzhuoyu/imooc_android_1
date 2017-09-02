package com.imooc.test;

//取
public class DrawAccount implements Runnable{

	Bank bank;
	
	public DrawAccount(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		bank.drawAccount();
	}

	
}
