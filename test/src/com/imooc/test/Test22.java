package com.imooc.test;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		
//		testAge();
		
//		try {
//			testAge();
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
		
		try {
			testAge();
		} catch (HotelAgeException e) {

			System.out.println(e.getMessage());
			System.out.println("�Ƶ�ǰ̨������Ա�����������פ�Ǽ�");
			
		}catch (Exception e) {

			e.printStackTrace();
		}

	}
	
//	public static void testAge() {
//	public static void testAge() throws Exception{
	public static void testAge() throws HotelAgeException {
		
//		try {
//			System.out.println("���������䣺");
//			Scanner input = new Scanner(System.in);
//			int age = input.nextInt();
//			if(age < 18 || age > 80) {
//				throw new Exception("18�����£�80�����ϵ�ס�ͱ�����������ͬ");
//			}else {
//				System.out.println("��ӭ��פ�Ƶ�");
//			}				
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
		
//		System.out.println("���������䣺");
//		Scanner input = new Scanner(System.in);
//		int age = input.nextInt();
//		if(age < 18 || age > 80) {
//			throw new Exception("18�����£�80�����ϵ�ס�ͱ�����������ͬ");
//		}else {
//			System.out.println("��ӭ��פ�Ƶ�");
//		}				
			
		System.out.println("���������䣺");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age < 18 || age > 80) {
			throw new HotelAgeException();
		}else {
			System.out.println("��ӭ��פ�Ƶ�");
		}	
	}

}
