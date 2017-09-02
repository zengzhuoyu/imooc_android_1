package com.imooc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("e.gif");
			FileOutputStream fos = new FileOutputStream("ecopy.gif");
			int n = 0;
			byte[] b = new byte[1024];
			while((n = fis.read(b)) != -1) {
				fos.write(b,0,n);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		

	}

}