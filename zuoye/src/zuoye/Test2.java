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
					actor = new Lion("Lain",2,"灰色","公狮");
					content += actor.act();
					break;				
					
				case 3:
					actor = new Monkey("Tom",1,"金丝猴");
					content += actor.act();
					break;		
					
				case 4:
					actor = new Parrot("Rose",1,"牡丹鹦鹉");
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
						System.out.println("*****  欢迎下次光临  *****");
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
		System.out.println("*******欢迎来到太阳马戏团*******");
		System.out.println("*********请选择表演者*********");
		System.out.println("*******  1.棕熊  *******");
		System.out.println("*******  2.狮子  *******");
		System.out.println("*******  3.猴子  *******");
		System.out.println("*******  4.鹦鹉  *******");
		System.out.println("*******  5.小丑  *******");
	}	
	
	public void warning() {
		System.out.println("** 输入信息不正确，请重新输入 **");
	}		
	
	public void continueNotice() {
		System.out.println();
		System.out.println("*******是否继续观看 (1/0)*******");
	}

}
