package com.imooc.test;

public class StudentTest {

	public static void main(String[] args) {
		
		Subject sub1 = new Subject("计算机科学与应用","J0001",4);

//		Student stu1 = new Student("S01","张三","男",200,sub1);
		Student stu1 = new Student("S01","张三","男",200);
		System.out.println(stu1.introduction());
//		Student stu2 = new Student("S02","李四","女",200,sub1);
//		Student stu3 = new Student("S03","王五","男",200,sub1);
		
		//测试指定专业中到底有多少学生报名
		sub1.addStudent(stu1);
//		sub1.addStudent(stu2);
//		sub1.addStudent(stu3);
		System.out.println(sub1.getSubjectName()+"的专业中已有"+sub1.getStudentNum()+"学生进行了报名");		
	}

}
