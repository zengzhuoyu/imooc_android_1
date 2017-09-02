package com.imooc.test;

import java.io.File;
import java.io.IOException;

public class Test41 {

	public static void main(String[] args) {
		
		File f = new File("test.txt");

		try {
			f.createNewFile();
			System.out.println(f.getPath());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
