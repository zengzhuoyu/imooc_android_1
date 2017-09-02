package com.imooc.test;

import java.io.File;

public class Test40 {

	public static void main(String[] args) {
		
//		File f1 = new File("F:\\java\\test.txt");
		File f1 = new File("F:\\java","test.txt");
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());

	}

}
