package com.imooc.test;

public class Test12 {

	public static void main(String[] args) {
		
//		Animal4 one = new Animal4();
//		Animal4 two = new Cat2();
//		Animal4 three = new Dog();
		
//		one.eat();
//		two.eat();
//		three.eat();
		

		/**
		 * ����ԭ��ǿ������ת����ǰ���Ǹ�������ָ��Ķ���������������ʱ��ſ��Խ���ǿ������ת����
		 * �����������ָ��Ķ�������Ͳ��������ʱ�򽫲���java.lang.ClassCastException�쳣��
		 */
//		Cat2 temp = (Cat2)one;
		
//		Cat2 temp = (Cat2)two;
//		temp.eat();
//		temp.run();
//		System.out.println(temp.getMonth());
		
//		Dog temp2 = (Dog)three;
//		temp2.eat();	
//		temp2.sleep();
//		System.out.println(temp2.getSex());	
		
//		if(two instanceof Cat2) {
//			Cat2 temp = (Cat2)two;
//			temp.eat();
//			temp.run();
//			temp.getMonth();
//			System.out.println("two����ת����Cat2����");
//		}
//		
//		if(two instanceof Dog) {
//			Dog temp2 = (Dog)two;
//			temp2.eat();	
//			temp2.sleep();
//			temp2.getSex();	
//			System.out.println("two����ת����Dog����");
//		}		
		
//		two.say();
//		Cat2 cat = (Cat2)two;
//		cat.say();
		
//		-----------------------------------
		
		Master master = new Master();
		Cat2 one = new Cat2();
		Dog two = new Dog();
//		master.feed(one);
//		master.feed(two);
		
//		-------------------------------------
		
//		boolean isManyTime = true;
//		Animal4 temp;
//		if(isManyTime) {
//			temp = master.hasManyTime();
//		}else {
//			temp = master.hasLittleTime();
//		}
//		
//		System.out.println(temp);
		
		boolean isManyTime = true;
		Animal4 temp = master.raise(isManyTime);
		
		System.out.println(temp);
	}

}
