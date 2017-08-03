package com.imooc.test;
/**
 * ¿¡∫∫ Ω
 * @author Administrator
 *
 */
public class Danli2 {

	private static Danli2 instance = null;
	
	private Danli2() {}
	
	public static Danli2 getInstance() {
		
		if(instance == null) {
			instance = new Danli2();
		}
		
		return instance;
	}
	
}
