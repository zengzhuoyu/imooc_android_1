package com.imooc.test;

public class Person3 {

	public static int age;
	
//	public Heart getHeart() {
//		new Heart().temp = 12;
//		return new Heart();
//	}
	
	//ֻ���Է���ֵ������Object����ΪString���͵Ķ���Ҳ��Object������
	public Object getHeart() {
		class Heart{
			
			public int age = 13;
			int temp = 22;
			
			public void say() {
				System.out.println("hello");
			}
			
			public String beat() {
				new Person3().eat();
				
				return Person3.age + "����������";
			}
		}
		
		return new Heart().beat(); 
		
	}

	
	public void eat() {
		System.out.println("�˻�Զ���");
	}
	
//	class Heart{
//		
//		int age = 13;
//		int temp = 22;
//		
//		public String beat() {
//			eat();
//			
////			return age + "����������";
//			return Person3.this.age + "����������";
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
			
//			return age + "����������";
//			return new Person3().age + "����������";
			
			return Person3.age + "����������";
		}
	}	
}
