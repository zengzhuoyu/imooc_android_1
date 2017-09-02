package com.imooc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("imooc.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			
			int n = 0;
			char[] cbuf = new char[10];
//			while((n = isr.read()) != -1) {
//				System.out.print((char)n);
//			}
			while((n = isr.read(cbuf)) != -1) {
				
				String s = new String(cbuf,0,n);
				System.out.print(s);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		}catch (IOException e) {

			e.printStackTrace();
		}

	}

}
