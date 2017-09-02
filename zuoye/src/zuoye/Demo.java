package zuoye;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * @description ����8��Ԫ�ص��������� 
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		int input;
		int[] data = null;
		boolean esc = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(!esc) {//while(true)
			demo.notice();
			
			input = sc.nextInt();
			
			switch(input) {
				case 1:
					data = demo.insertData();
					demo.showData(data,data.length);		
					break;
					
				case 2:
					demo.showData(data,8);
					break;
					
				case 3:
					System.out.println("������Ҫ��������ݣ�");
					int num = sc.nextInt();
					System.out.println("������Ҫ��������λ�ã�");
					int location = sc.nextInt();					
					demo.insertAtArray(data,num,location);
					break;
					
				case 4:
					demo.divThree(data);
					break;
					
				case 0:
					esc = true;
					System.out.println("�˳�����");
					break;
					
				default:
					System.out.println("��������ȷ�����֣�");
					//Ϊ��ʹswitch����﷨����������������default���������һ��break
					break;
					
			}
			
			System.out.println();
			
		}

	}
	
	public void notice() {
		System.out.println("*************************");
		System.out.println("       1--��������");
		System.out.println("       2--��ʾ��������");
		System.out.println("       3--��ָ��λ�ô���������");
		System.out.println("       4--��ѯ�ܱ�3����������");
		System.out.println("       0--�˳�");
		System.out.println("*************************");
		
		System.out.println("�������Ӧ�����ֽ��в�����");
	}
	
	public int[] insertData() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[8];
		
		for(int i = 0;i < 7;i++) {
			System.out.println("�������" + (i+1) +"�����ݣ�");
			int input = sc.nextInt();//
			if(input == 0) {
				System.out.println("��ӵ������е����ݲ���Ϊ0");
				i--;
				continue;
			}
			data[i] = input;
			
		}
		
		return data;
		
	}
	
	public void showData(int[] data,int length) {
		System.out.println("����Ԫ��Ϊ��");
		for(int i = 0;i < length;i++) {
			if(data[i] != 0) {//
				System.out.print(data[i] + "   ");
			}
		}
	}
	
	/**
	 * 
	 * @param data
	 * @param n ���������
	 * @param k �����λ��
	 */
 	public void insertAtArray(int[] data,int n,int k) {
		
		if(!(k == data.length - 1)) {

			//Ӧ�ý�i>=k�޸�Ϊi>k����Ȼ�ᵼ������ĵ�0�������޷��������ݡ�
			//��������Ĳ��������һ��Ҫ���ǵ�һ�������һ�����м��λ�����
			for(int i = data.length -1;i > k;i--) {//����˼ά
				data[i] = data[i-1];
			}
		}
		
 		data[k] = n;	
 		
		//�������Ԫ��ʱ������ֱ�ӵ�����ʾ���ݷ���
 		//���ظ��ĵط����ǿ����Ż��ĵط�
 		showData(data,8);//����mainͬ�����Զ��巽���е�������������ֱ��д������		
 	}
 	
 	public void divThree(int[] data) {
 		
 		String str = "";
 		for(int value:data) {
			if(value % 3 == 0 && value != 0) {
				str += value + " ";
			}
		}
 		
 		if(str.equals("")) {
 			System.out.print("û���ܱ�3����������");
 		}else {
 			System.out.print("�������ܱ�3������Ԫ��Ϊ��");
 			System.out.print(str);
 		}
 		
 	}

}
