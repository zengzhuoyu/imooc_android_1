package com.imooc.test;

public class Consumer implements Runnable{
	Queue queue;
	Consumer(Queue queue){
		this.queue=queue;
	}

	@Override
	public void run() {
		while(true){
			queue.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
