package com.imooc.test;

public class Test19 {

//	public void getRead(Man man) {
//		man.read();
//	}
//	
//	public void getRead(Woman woman) {
//		woman.read();
//	}
	
	public void getRead(Person4 person) {
		person.read();
	}
	
	public static void main(String[] args) {
		
		Test19 test = new Test19();
//		Man one = new Man();
//		Woman two = new Woman();
//		test.getRead(one);
//		test.getRead(two);

		test.getRead(new Person4(){
			
//			public static int age = 12;
			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("男生喜欢看科幻类书籍");
			}
		});
		
		test.getRead(new Person4(){
			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("女生喜欢看言情小说");
			}
		});		
	}

}
