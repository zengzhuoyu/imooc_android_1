package zuoye;

public class Test {

	public static void main(String[] args) {
				
		//部门
		Department dm1 = new Department("S9527","人事部");
		Department dm2 = new Department("S9528","市场部");
		
		//职务
		Duty duty1 = new Duty("okc1","经理");
		Duty duty2 = new Duty("okc2","职员");
		
		//员工
		Staff staff1 = new Staff("张三","S001",17,'不',duty1);
		dm1.addStaff(staff1);
		System.out.println(staff1.introStaff());
		
		Staff staff2 = new Staff("李四","S002",23,'女',duty2);
		dm2.addStaff(staff2);
		System.out.println(staff2.introStaff());	
		
		System.out.println(dm1.getDepartmentName() + "共有" + dm1.getStaffNum() + "名员工");
		System.out.println(dm2.getDepartmentName() + "共有" + dm2.getStaffNum() + "名员工");
	}

}
