package com.imooc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		
		FileInputStream fis;
		try {
			
			fis = new FileInputStream("imooc.txt");
			
//			int n = fis.read();
//			System.out.println((char)n);
			
//			int n = 0;
//			while((n = fis.read()) != -1) {
//				System.out.print((char)n);
//			}
			
			//将文件中的100个字节的数据读入byte数组中
			byte[] b = new byte[100];
			fis.read(b);
			System.out.println(new String(b));
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

		

	}

}
