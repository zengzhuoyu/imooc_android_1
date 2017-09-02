package zuoye;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 test = new Test2();
		boolean key = false;
		
		Scanner sc = new Scanner(System.in);
		int input,isContinue;
		String content;
		
		boolean isContinueKey;
		
		IAct actor = null;
		
		while(!key) {
			
			content = "";
			isContinueKey = false;
			
			test.notice();
			
			input = sc.nextInt();
			
			switch(input) {
			
				case 1:
					actor = new Bear("Bill",1);
					content += actor.act();
					break;
					
				case 2:
					actor = new Lion("Lain",2,"��ɫ","��ʨ");
					content += actor.act();
					break;				
					
				case 3:
					actor = new Monkey("Tom",1,"��˿��");
					content += actor.act();
					break;		
					
				case 4:
					actor = new Parrot("Rose",1,"ĵ������");
					content += actor.act();
					break;
					
				case 5:
					actor = new Clown("Kahle",5);
					content += actor.act();
					break;		
					
				default:
					test.warning();
					continue;					
					
			}
			
			if(!content.equals("")) {
				System.out.println(content);
			}
						
			while(!isContinueKey) {
				
				test.continueNotice();
				
				isContinue = sc.nextInt();
				
				switch(isContinue) {
				
					case 0:
						key = true;
						isContinueKey = true;
						System.out.println("*****  ��ӭ�´ι���  *****");
						break;
					case 1:
						isContinueKey = true;
						break;
					default:
						test.warning();
						break;
				}
			}

			
		}
		
		
		
	}
	
	public void notice() {
		System.out.println();
		System.out.println("*******��ӭ����̫����Ϸ��*******");
		System.out.println("*********��ѡ�������*********");
		System.out.println("*******  1.����  *******");
		System.out.println("*******  2.ʨ��  *******");
		System.out.println("*******  3.����  *******");
		System.out.println("*******  4.����  *******");
		System.out.println("*******  5.С��  *******");
	}	
	
	public void warning() {
		System.out.println("** ������Ϣ����ȷ������������ **");
	}		
	
	public void continueNotice() {
		System.out.println();
		System.out.println("*******�Ƿ�����ۿ� (1/0)*******");
	}

}
