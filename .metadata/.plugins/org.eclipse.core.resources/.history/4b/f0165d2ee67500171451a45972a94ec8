package zuoye;

public class Department {
	private String departmentNo;
	private String departmentName;
	private Staff[] staffs;
	private int staffNum;
	
	public Department() {}
	public Department(String departmentNo,String departmentName) {
		this.setDepartmentNo(departmentNo);
		this.setDepartmentName(departmentName);
	}
	
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	/**
	 * 获取所在当前部门的员工信息 如果保存员工信息的数组未被初始化，则，先初始化长度200
	 * @return 保存员工信息的数组
	 */		
	public Staff[] getStaffs() {
		if(this.staffs == null) {
			this.staffs = new Staff[200];	
		}
			
		return staffs;
	}
	public void setStaffs(Staff[] staffs) {
		this.staffs = staffs;
	}
	
	public int getStaffNum() {
		return staffNum;
	}
	
	public void setStaffNum(int staffNum) {
		this.staffNum = staffNum;
	}
	
	/**
	 * 逐个添加员工信息到指定部门：员工和部门的双向关联
	 * @param sta 员工信息
	 */
	public void addStaff(Staff sta) {
		
		for(int i = 0;i < this.getStaffs().length;i++) {
			
			if(this.getStaffs()[i] == null) {
				
				//加入当前部门的员工添加其的所在部门属性
				sta.setStaffDepartment(this);
				//当前部门添加现在加入的员工
				this.getStaffs()[i] = sta;
				
				this.staffNum = i+1;
				
				return;
			}

		}
		
	}
	
}
