package zuoye;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * @description 包含8个元素的整型数组 
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
					System.out.println("数组元素为：");
					for(int value:data) {//不是int[]
						if(value != 0) {
							System.out.print(value + "   ");
						}
					}		
					break;
					
				case 2:
					demo.showData(data,8);
					break;
					
				case 3:
					System.out.println("请输入要插入的数据：");
					int num = sc.nextInt();
					System.out.println("请输入要插入数据位置：");
					int location = sc.nextInt();					
					demo.insertAtArray(data,num,location);
					break;
					
				case 4:
					demo.divThree(data);
					break;
					
				case 0:
					esc = true;
					System.out.println("退出程序！");
					break;
					
				default:
					System.out.println("请输入正确的数字！");
					
			}
			
			System.out.println();
			
		}

	}
	
	public void notice() {
		System.out.println("*************************");
		System.out.println("       1--插入数据");
		System.out.println("       2--显示所有数据");
		System.out.println("       3--在指定位置处插入数据");
		System.out.println("       4--查询能被3整除的数据");
		System.out.println("       0--退出");
		System.out.println("*************************");
		
		System.out.println("请输入对应的数字进行操作：");
	}
	
	public int[] insertData() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[8];
		
		for(int i = 0;i < 7;i++) {
			System.out.println("请输入第" + (i+1) +"个数据：");
			int input = sc.nextInt();//
			if(input == 0) {
				System.out.println("添加到数组中的数据不能为0");
				i--;
				continue;
			}
			data[i] = input;
			
		}
		
		return data;
		
	}
	
	public void showData(int[] data,int length) {
		System.out.println("数组元素为：");
		for(int i = 0;i < length;i++) {
			if(data[i] != 0) {//
				System.out.print(data[i] + "   ");
			}
		}
	}
	
	/**
	 * 
	 * @param data
	 * @param n 插入的数据
	 * @param k 插入的位置
	 */
 	public void insertAtArray(int[] data,int n,int k) {
		
		if(!(k == data.length - 1)) {

			for(int i = data.length -1;i >= k;i--) {//逆向思维
				data[i] = data[i-1];
			}
		}
		
 		data[k] = n;	
 		
		System.out.println("数组元素为：");
		for(int i = 0;i < data.length;i++) {
			System.out.print(data[i] + "   ");
		} 		
 	}
 	
 	public void divThree(int[] data) {
		System.out.print("数组中能被3整除的元素为：");
 		for(int value:data) {
 			if(value % 3 == 0 && value != 0) {
 				System.out.print(value + "   ");
 			}
 		}
 	}

}
