package com.imooc;

import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n + "��ż��");
		}else {
			System.out.println(n + "������");
		}
	}

}
