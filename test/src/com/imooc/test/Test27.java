package com.imooc.test;

public class Test27 {

	public static void main(String[] args) {
		//定义字符串"abc"
		StringBuilder str = new StringBuilder("abc");
        //经过处理得到字符串"fed---cba"
		str.append("def").reverse().insert(3,"---");
        
        //进一步变换得到字符串"fedcba"
		str.replace(3, 6, "");
		System.out.println(str);

	}

}
