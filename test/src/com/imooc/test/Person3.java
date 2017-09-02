package com.imooc.test;

public class Person3 {

	public static int age;
	
//	public Heart getHeart() {
//		new Heart().temp = 12;
//		return new Heart();
//	}
	
	//只所以返回值类型是Object是因为String类型的对象也是Object的子类
	public Object getHeart() {
		class Heart{
			
			public int age = 13;
			int temp = 22;
			
			public void say() {
				System.out.println("hello");
			}
			
			public String beat() {
				new Person3().eat();
				
				return Person3.age + "心脏在跳动";
			}
		}
		
		return new Heart().beat(); 
		
	}

	
	public void eat() {
		System.out.println("人会吃东西");
	}
	
//	class Heart{
//		
//		int age = 13;
//		int temp = 22;
//		
//		public String beat() {
//			eat();
//			
////			return age + "心脏在跳动";
//			return Person3.this.age + "心脏在跳动";
//		}
//	}
	
	static class Heart{
		
		public static int age = 13;
		int temp = 22;
		
		public static void say() {
			System.out.println("hello");
		}
		
		public String beat() {
			new Person3().eat();
			
//			return age + "心脏在跳动";
//			return new Person3().age + "心脏在跳动";
			
			return Person3.age + "心脏在跳动";
		}
	}	
}
