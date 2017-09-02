package com.imooc.test;

import java.util.LinkedList;
import java.util.List;

public class Test33 {

	public static void main(String[] args){
		
		LinkedList<Student3> stuList = new LinkedList<Student3>();
		
		Student3 stu1 = new Student3("001","Mike",18);
		Student3 stu2 = new Student3("002","Jack",28);
		Student3 stu3 = new Student3("003","Lucy",38);
		
		stuList.push(stu1);
		stuList.push(stu2);
		stuList.push(stu3);
		
		System.out.println(stuList);
		System.out.println(stuList.pop());
		System.out.println(stuList);
		System.out.println(stuList.peek());
		System.out.println(stuList);
		System.out.println(stuList.pop());
		System.out.println(stuList);		
		
		stuList.push(stu2);
		stuList.push(stu3);
		
		System.out.println(stuList);
		
		System.out.println(stuList.poll());
		System.out.println(stuList);		
	}

}
