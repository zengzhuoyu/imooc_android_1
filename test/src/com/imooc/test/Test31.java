package com.imooc.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test31 {

	public static void main(String[] args) {
		//定义三个Student类的对象及一个HashSet类的对象
        Student2 stu1 = new Student2(1,"Tom",87f);
        Student2 stu2 = new Student2(2,"Lucy",95f);
        Student2 stu3 = new Student2(3,"William",65f);
		
        Set set = new HashSet();
		//将Student类的对象添加到集合中
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
        
		//使用迭代器显示Student类的对象中的内容
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("***********");
		
		Student2 stu4 = new Student2(1,"Tom",80f);
		set.add(stu4);
		it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
