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
		if(sex != '男' && sex != '女') {
			this.sex = '男';
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
	 * 获取员工信息：包含部门、职务
	 * @return
	 */
	public String introStaff() {
		
		String str = "姓名：" + this.getStaffName() + "\n工号："
				+ this.getStaffNo() + "\n性别：" + this.getSex() 
				+ "\n年龄：" + this.getAge() + "\n职务：" 
				+ this.getStaffDepartment().getDepartmentName()
				+ this.getStaffDuty().getDutyName()
				+ "\n=====================";
		
		return str;
	}

}
