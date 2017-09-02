package com.imooc.test;

public class Master {
	
//	public void feed(Cat2 cat){
//		cat.eat();
//		cat.playBall();
//	} 
//	
//	public void feed(Dog dog){
//		dog.eat();
//		dog.sleep();
//	} 	
	
	public void feed(Animal4 obj) {
		obj.eat();
		if(obj instanceof Cat2) {
			Cat2 temp = (Cat2)obj;
			temp.playBall();
		}else if(obj instanceof Dog) {
			Dog temp = (Dog)obj;
			temp.sleep();
		}
	}
	
//	public Dog hasManyTime() {
//		System.out.println("��������ʱ��Ƚϳ��㣬�ʺ�������");
//		return new Dog();
//	}
//	
//	public Cat2 hasLittleTime() {
//		System.out.println("����ƽʱ�Ƚ�æµ���ʺ���è��");
//		return new Cat2();
//	}
	
	public Animal4 raise(boolean isManyTime) {
		if(isManyTime) {
			System.out.println("��������ʱ��Ƚϳ��㣬�ʺ�������");
			return new Dog();
		}else {
			System.out.println("����ƽʱ�Ƚ�æµ���ʺ���è��");
			return new Cat2();
		}
	}
}
