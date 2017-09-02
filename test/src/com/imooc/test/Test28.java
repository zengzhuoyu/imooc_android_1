package com.imooc.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test28 {

	public static void main(String[] args) {
		
		Notice n1 = new Notice(1,"欢迎来到慕课学院","管理员",new Date());
		Notice n2 = new Notice(2,"请同学们按时提交作业","老师",new Date());
		Notice n3 = new Notice(3,"考勤通知","老师",new Date());

		List<Notice> noticeList = new ArrayList<Notice>();
		noticeList.add(n1);
		noticeList.add(n2);
		noticeList.add(n3);
		
//		for(int i = 0;i < noticeList.size();i++) {
//			System.out.println(i + 1 + ":" + ((Notice)(noticeList.get(i))).getTitle());
//		}
		
		Notice n4 = new Notice(4,"在线编辑器可以使用了","管理员",new Date());
		noticeList.add(1,n4);
		
//		for(int i = 0;i < noticeList.size();i++) {
//			System.out.println(i + 1 + ":" + ((Notice)(noticeList.get(i))).getTitle());
//		}
		
		noticeList.remove(2);
		
//		for(int i = 0;i < noticeList.size();i++) {
//			System.out.println(i + 1 + ":" + ((Notice)(noticeList.get(i))).getTitle());
//		}		
		
		n4.setTitle("java在线编辑器可以使用了");
		noticeList.set(1, n4);
		for(int i = 0;i < noticeList.size();i++) {
			System.out.println(i + 1 + ":" + noticeList.get(i).getTitle());
		}			
	}

}
