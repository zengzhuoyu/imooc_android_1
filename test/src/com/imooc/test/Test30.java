package com.imooc.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test30 {

	public static void main(String[] args) {
		
		Cat5 huahua = new Cat5("花花",12,"英国短毛猫");
		Cat5 fanfan = new Cat5("凡凡",3,"中华田园猫");
		
		Set<Cat5> set = new HashSet<Cat5>();
		set.add(huahua);
		set.add(fanfan);

		Iterator<Cat5> it = set.iterator();
		
//		Cat5 huahua2 = new Cat5("花花",12,"英国短毛猫");
//		set.add(huahua2);
//		it = set.iterator();
		
		Cat5 huahua2 = new Cat5("花花二代",2,"英国短毛猫");
		set.add(huahua2);
		it = set.iterator();
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		boolean flag = false;
//		Cat5 c = null;
//		it = set.iterator();
//		while(it.hasNext()) {
//			c = it.next();
//			if(c.getName().equals("花花")) {
//				flag = true;
//				break;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("花花找到了");
//			System.out.println(c);
//		}else {
//			System.out.println("花花没找到");
//		}
		
//		for(Cat5 cat:set) {
//			if("花花二代".equals(cat.getName())) {
//				set.remove(cat);break;
//			}
//		}
		
//		it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}		
		
		Set<Cat5> set2 = new HashSet<Cat5>();
		for(Cat5 cat:set) {
			if(cat.getMonth() < 5) {
				set2.add(cat);
			}
		}
		set.removeAll(set2);
		
		for(Cat5 cat:set) {
			System.out.println(cat);
		}		
	}

}
