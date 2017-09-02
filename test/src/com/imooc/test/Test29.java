package com.imooc.test;

import java.util.List;
import java.util.ArrayList;

public class Test29 {

	public static void main(String[] args) {
		//定义ArrayList对象
        List emList = new ArrayList();
        
        //创建三个Employee类的对象
        Employee em1 = new Employee(1, "张三", 5000);
        Employee em2 = new Employee(2, "李四", 5500);
        Employee em3 = new Employee(3, "赵六", 4500);
        
        //添加员工信息到ArrayList
        emList.add(em1);
        emList.add(em2);
        emList.add(em3);
        
        System.out.println("员工姓名" + "    " + "员工薪资");
        //显示员工的姓名和薪资
        for(int i = 0;i<emList.size();i++) {
        	
        	System.out.println(((Employee)emList.get(i)).getName() + "    " +  ((Employee)emList.get(i)).getSalary());
        }

	}

}
