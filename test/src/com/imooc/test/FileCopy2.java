package com.imooc.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("e.gif");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream("ecopy.gif");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			long startTime = System.currentTimeMillis();
			
			int n = 0;
			byte[] b = new byte[1024];
			
//			while((n = fis.read(b)) != -1) {
//				fos.write(b,0,n);
//			}
			while((n = bis.read(b)) != -1) {
				bos.write(b,0,n);
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println(endTime - startTime);
			
			fis.close();
			bis.close();
			fos.close();
			bos.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		

	}

}
