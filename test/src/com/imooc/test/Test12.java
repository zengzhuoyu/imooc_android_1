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
		 * 报错原因：强制类型转换的前提是父类引用指向的对象的类型是子类的时候才可以进行强制类型转换，
		 * 如果父类引用指向的对象的类型不是子类的时候将产生java.lang.ClassCastException异常。
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
//			System.out.println("two可以转换成Cat2类型");
//		}
//		
//		if(two instanceof Dog) {
//			Dog temp2 = (Dog)two;
//			temp2.eat();	
//			temp2.sleep();
//			temp2.getSex();	
//			System.out.println("two可以转换成Dog类型");
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
