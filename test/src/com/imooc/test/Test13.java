package com.imooc.test;

public class Test13 {

	public static void main(String[] args) {
        //生成父类对象数组,数组长度为5
        Animal5 animals[] = new Animal5[5];
        
        int number;
		//产生随机数，随机产生三种具体子类的实例
        for(int i = 0;i < animals.length;i++) {
        	number = (int)(Math.random() * 3);

        	switch(number) {
        		case 0:
        			animals[i] = new Cat3();
        			break;
        		case 1:
        			animals[i] = new Dog2();
        			break;   
        		case 2:
        			animals[i] = new Sheep();
        			break;         			
        	}
        }
        
       //循环输出，循环体中每个对象分别调用cry()方法。
        for(Animal5 value:animals) {
        	
        	if(value instanceof Cat3) {
        		Cat3 cat = (Cat3)value;
        		cat.cry();
        	}else if(value instanceof Dog2) {
        		Dog2 dog = (Dog2)value;
        		dog.cry();
        	}else if(value instanceof Sheep) {
        		Sheep sheep = (Sheep)value;
        		sheep.cry();
        	}
        }
	}

}
