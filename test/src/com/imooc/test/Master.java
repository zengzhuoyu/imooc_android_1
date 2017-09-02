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
//		System.out.println("主人休闲时间比较充足，适合养狗狗");
//		return new Dog();
//	}
//	
//	public Cat2 hasLittleTime() {
//		System.out.println("主人平时比较忙碌，适合养猫咪");
//		return new Cat2();
//	}
	
	public Animal4 raise(boolean isManyTime) {
		if(isManyTime) {
			System.out.println("主人休闲时间比较充足，适合养狗狗");
			return new Dog();
		}else {
			System.out.println("主人平时比较忙碌，适合养猫咪");
			return new Cat2();
		}
	}
}
