package com.imooc.test;

public class Test {

	public static void main(String[] args) {
	     //实例化对象，调用相关方法实现运行效果
	     
	     User user1 = new User(null,"123456");
	     User user2 = new User("Mike","123456");
	     
	     user1.printMess();
	     user2.printMess();
	     
	     System.out.println("==========");
	     
	     UserManager um = new UserManager();
	     
	     String res = um.checkUser(user1,user2);
	     System.out.println(res);

	}

}
