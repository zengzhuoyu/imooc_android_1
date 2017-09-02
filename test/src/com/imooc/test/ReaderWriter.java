package com.imooc.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderWriter {

	public static void main(String[] args) {
		
//		try {
//			
//			FileInputStream fis = new FileInputStream("imooc.txt");
//			InputStreamReader isr = new InputStreamReader(fis);
//			FileOutputStream fos = new FileOutputStream("imooc1.txt");
//			OutputStreamWriter osw = new OutputStreamWriter(fos);
//			
//			int n = 0;
//			char[] cbuf = new char[10];
//			
//			while((n = isr.read(cbuf)) != -1) {
//				osw.write(cbuf,0,n);
//				osw.flush();
//			}
//			
//			fis.close();
//			fos.close();
//			isr.close();
//			osw.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//加入缓冲区
		try {
			
//			FileInputStream fis = new FileInputStream("imooc.txt");
//			InputStreamReader isr = new InputStreamReader(fis);
//			BufferedReader br = new BufferedReader(isr);
			FileReader fr = new FileReader("imooc.txt");
			BufferedReader br = new BufferedReader(fr);
			
//			FileOutputStream fos = new FileOutputStream("imooc1.txt");
//			OutputStreamWriter osw = new OutputStreamWriter(fos);
//			BufferedWriter bw = new BufferedWriter(osw); 
			FileWriter fw = new FileWriter("imooc1.txt");
			BufferedWriter bw = new BufferedWriter(fw); 
			
			int n = 0;
			char[] cbuf = new char[10];
			
			while((n = br.read(cbuf)) != -1) {
				bw.write(cbuf,0,n);
				bw.flush();
			}
			
//			fis.close();
//			fos.close();
//			isr.close();
//			osw.close();
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}