package com.imooc.test;

public class DevelopmentWork extends Work{
    // 属性：有效编码行数、目前没有解决的Bug个数
	private int userfulRow;
	private int existBugNum;
	
	public DevelopmentWork() {}
	
	//编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public DevelopmentWork(String name,int userfulRow,int existBugNum) {
		super(name);
		this.setUserfulRow(userfulRow);
		this.setExistBugNum(existBugNum);
	}
	
    // 公有的get***/set***方法完成属性封装
	public int getUserfulRow() {
		return userfulRow;
	}

	public void setUserfulRow(int userfulRow) {
		this.userfulRow = userfulRow;
	}

	public int getExistBugNum() {
		return existBugNum;
	}

	public void setExistBugNum(int existBugNum) {
		this.existBugNum = existBugNum;
	}
	
	// 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
	public String work() {
        String str = super.getName() + "的日报是：今天编写了" + this.getUserfulRow()
        + "行代码，目前仍然有" + this.getExistBugNum() + "个bug没有解决。";
        
        return str;
	}

}
