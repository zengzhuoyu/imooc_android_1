package com.imooc.test;

public class Test3 {

	public static void main(String[] args) {
		
		System.out.print("������Ϣ���ԣ�");
		NonMotor nonMotor = new NonMotor("����","��",4,2);
		System.out.println(nonMotor.work());
		
		System.out.print("���г�����Ϣ���ԣ�");
		Bicycle bicycle = new Bicycle("�ݰ���","��");
		System.out.println(bicycle.work());
		
		System.out.print("�綯������Ϣ���ԣ�");
		ElectricVehicle electricVehicle = new ElectricVehicle("�ɸ�");
		System.out.println(electricVehicle.work());
		
		System.out.print("���ֳ�����Ϣ���ԣ�");
		Tricycle tricycle = new Tricycle();
		System.out.println(tricycle.work());		
	}

}
