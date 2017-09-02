package com.imooc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test32 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		Map<String,Goods> goodsMap = new HashMap<String,Goods>();
		
		int i = 0;
		while(i < 3) {
			System.out.println("输入第" + (i + 1) + "条商品信息：");
			System.out.println("输入商品编号：");
			String goodsId = console.next();
			
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("该商品编号已经存在！请重新输入！");
				continue;
			}
			
			System.out.println("输入商品名称：");
			String goodsName = console.next();
			System.out.println("输入商品价格：");
			double goodsPrice = 0;
			try {
				goodsPrice = console.nextDouble();
			}catch(java.util.InputMismatchException e) {
				System.out.println("商品价格的格式不正确，请输入数值型数据！");
				console.next();
				continue;
			}
			
			Goods goods = new Goods(goodsId,goodsName,goodsPrice);
			goodsMap.put(goodsId,goods);
			i++;
		}
		
		System.out.println("**************");
		
		Iterator<Goods> itGoods = goodsMap.values().iterator();
		while(itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}

	}

}
