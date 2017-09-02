package com.imooc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootBall {

	public static void main(String[] args) {
		
		//定义HashMap的对象并添加数据
       Map<Integer,String> animal = new HashMap<Integer,String>();
       animal.put(2014,"德国");
       animal.put(2010,"西班牙");
       animal.put(2006,"意大利");
       
		//使用迭代器的方式遍历
		Iterator<String> it = animal.values().iterator();
        while(it.hasNext()) {
        	System.out.print(it.next() + " ");
        }
        
        System.out.println();
        
		//使用EntrySet同时获取key和value
        Set<Entry<Integer,String>> entrySet = animal.entrySet();
        for(Entry<Integer,String> entry:entrySet) {
        	System.out.println(entry.getKey() + "-" + entry.getValue());
        }

	}

}
