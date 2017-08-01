package com.imooc.test;

public class TestWork extends Work{
    //属性：编写的测试用例个数、发现的Bug数量
	private int exampleNum;
	private int bugNum;
	
	public TestWork() {}
	
    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public TestWork(String name,int exampleNum,int bugNum) {
		super(name);
		this.setExampleNum(exampleNum);
		this.setBugNum(bugNum);
	}
	
    // 公有的get***/set***方法完成属性封装
	public int getExampleNum() {
		return exampleNum;
	}

	public void setExampleNum(int exampleNum) {
		this.exampleNum = exampleNum;
	}

	public int getBugNum() {
		return bugNum;
	}

	public void setBugNum(int bugNum) {
		this.bugNum = bugNum;
	}
	
	// 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
	public String work() {
        String str = super.getName() + "的日报是：今天编写了" + this.getExampleNum()
        + "个测试用例，发现了" + this.getBugNum() + "bug。";
        
        return str;
	}


}
