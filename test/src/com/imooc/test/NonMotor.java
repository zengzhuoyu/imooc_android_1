package com.imooc.test;

public class NonMotor {
    // 私有属性：品牌、颜色、轮子(默认2个)、座椅（默认 1个）
	private String logo;
	private String color;
	private int wheelNum = 2;
	private int chairNum = 1;
	
	// 无参构造方法
	public NonMotor() {}
	// 双参构造方法，完成对品牌和颜色的赋值
	public NonMotor(String logo,String color) {
		this.setLogo(logo);
		this.setColor(color);
	}
	
	// 四参构造方法，分别对所有属性赋值
	public NonMotor(String logo,String color,int wheelNum,int chairNum) {
		this.setLogo(logo);
		this.setColor(color);
		this.setWheelNum(wheelNum);
		this.setChairNum(chairNum);
	}
	
   // 公有的get***/set***方法完成属性封装
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheelNum() {
		return wheelNum;
	}
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}
	public int getChairNum() {
		return chairNum;
	}
	public void setChairNum(int chairNum) {
		this.chairNum = chairNum;
	}
	
	// 方法：运行，描述内容为：这是一辆**颜色的，**牌的非机动车，有**个轮子，有**个座椅的非机动车。其中**的数据由属性提供
	public String work() {
		String str = "这是一辆"+ this.getColor() +"颜色的，"+ this.getLogo() 
					+"牌的非机动车，有"+ this.getWheelNum() 
					+"个轮子，有"+ this.getChairNum() +"个座椅。";
		return str;
	}

}
