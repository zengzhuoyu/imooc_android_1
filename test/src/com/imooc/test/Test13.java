package com.imooc.test;

public class Test13 {

	public static void main(String[] args) {
        //���ɸ����������,���鳤��Ϊ5
        Animal5 animals[] = new Animal5[5];
        
        int number;
		//���������������������־��������ʵ��
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
        
       //ѭ�������ѭ������ÿ������ֱ����cry()������
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
