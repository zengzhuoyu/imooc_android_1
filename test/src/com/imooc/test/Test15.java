package com.imooc.test;

public class Test15 {

	public static void main(String[] args) {
		Fourthphone phone = new Fourthphone();
		
//		phone.call();
//		phone.message();
//		phone.video();
//		phone.music();
//		phone.photo();
//		phone.network();
		
//		IPhoto ip = new Fourthphone();
//		ip.photo();
//		ip = new Camera();
//		ip.photo();

//		System.out.println(INet.TEMP);
		
//		INet net = new SmartWatch();
//		net.network();
//		System.out.println(net.TEMP);
		
//		SmartWatch sw = new SmartWatch();
//		System.out.println(sw.TEMP);
		
//		net.connection();
//		INet.stop();
//		IPhoto ip = new SmartWatch();
//		ip.connection();
		
		INet net = new Fourthphone();
		net.connection();
		IPhoto ip = new Fourthphone();
		ip.connection();
		
	}

}
