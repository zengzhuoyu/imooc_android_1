package zuoye;

public class Test {

	public static void main(String[] args) {
				
		//����
		Department dm1 = new Department("S9527","���²�");
		Department dm2 = new Department("S9528","�г���");
		
		//ְ��
		Duty duty1 = new Duty("okc1","����");
		Duty duty2 = new Duty("okc2","ְԱ");
		
		//Ա��
		Staff staff1 = new Staff("����","S001",17,'��',duty1);
		dm1.addStaff(staff1);
		System.out.println(staff1.introStaff());
		
		Staff staff2 = new Staff("����","S002",23,'Ů',duty2);
		dm2.addStaff(staff2);
		System.out.println(staff2.introStaff());	
		
		System.out.println(dm1.getDepartmentName() + "����" + dm1.getStaffNum() + "��Ա��");
		System.out.println(dm2.getDepartmentName() + "����" + dm2.getStaffNum() + "��Ա��");
	}

}