package zuoye;

public class Staff {
	private String staffName;
	private String staffNo;
	private int age;
	private char sex;
	private Department staffDepartment;
	private Duty staffDuty;
	
	public Staff() {}
	public Staff(String staffName,String staffNo,int age,char sex,Duty staffDuty) {
		this.setStaffName(staffName);
		this.setStaffNo(staffNo);
		this.setAge(age);
		this.setSex(sex);
		this.setStaffDuty(staffDuty);
	}
	
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 18 || age > 65) {
			this.age = 18;
		}else {
			this.age = age;	
		}
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		if(sex != '��' && sex != 'Ů') {
			this.sex = '��';
		}else {
			this.sex = sex;	
		}

	}
	public Department getStaffDepartment() {	
		return staffDepartment;
	}
	public void setStaffDepartment(Department staffDepartment) {
		this.staffDepartment = staffDepartment;
	}
	public Duty getStaffDuty() {
		return staffDuty;
	}
	public void setStaffDuty(Duty staffDuty) {
		this.staffDuty = staffDuty;
	}
	
	/**
	 * ��ȡԱ����Ϣ���������š�ְ��
	 * @return
	 */
	public String introStaff() {
		
		String str = "������" + this.getStaffName() + "\n���ţ�"
				+ this.getStaffNo() + "\n�Ա�" + this.getSex() 
				+ "\n���䣺" + this.getAge() + "\nְ��" 
				+ this.getStaffDepartment().getDepartmentName()
				+ this.getStaffDuty().getDutyName()
				+ "\n=====================";
		
		return str;
	}

}
