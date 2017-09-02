package com.imooc.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Word {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		
		Iterator it = set.iterator();
		
		set.add("green");
		it = set.iterator();
		
//		set.add("green");
//		it = set.iterator();	
		
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}

	}

}
