package com.imooc.test;

public class Test8 {

	public static void main(String[] args) {
		//ʵ����������󣬲�����������ͬ������ֵ
		Car car1 = new Car("��ɫ","��СȪ");
		Car car2 = new Car("��ɫ","��СȪ");

		//���ø���use����
		car1.use();

		//ͨ����дequals�������Ƚ����������Ƿ����
		boolean flag = car1.equals(car2);
		System.out.println("ca1��car2�����ñȽϣ�" + flag);


		System.out.println("==================================");
        //ʵ��������Taxi���󣬲���������ֵ
		Taxi taxi = new Taxi("��ɫ","��СȪ","������˾");

		//����ride��use����
		taxi.ride();
		taxi.use();

		//�����дtoString���taxi��Ϣ
		System.out.println(taxi);

		System.out.println("==================================");
		//ʵ��������HomeCar���󣬲���������ֵ
		HomeCar homeCar = new HomeCar("��ɫ","�����",7);

		//����display�������������ط���
		homeCar.display();
		homeCar.display(5);

	}

}