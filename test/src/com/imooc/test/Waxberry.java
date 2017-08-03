package com.imooc.test;

//要求Waxberry类不允许有子类
public final class Waxberry extends Fruits{
  // 私有属性：颜色（color）
  private String color;

	//创建构造方法，完成调用父类的构造方法，完成属性赋值
  public Waxberry(String shape,String taste,String color){
	  super(shape,taste);
	  this.setColor(color);
  }

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
  
  //创建不允许重写的face方法，描述为：杨梅：**、**，果味酸甜适中
  public final String face() {
	  //在这里的情况，用this还是super都是可行的：调用的都是父类中的属性
//	  String str = "杨梅：" + this.getColor() + "、" + this.getShape() + "，果味" + this.getTaste();
	  String str = "杨梅：" + this.getColor() + "、" + super.getShape() + "，果味" + super.getTaste();
	  
	  return str;
  }
  
  //重写父类eat方法，描述为：杨梅酸甜适中，非常好吃！
  @Override
	public void eat() {
	  System.out.println("杨梅酸甜适中，非常好吃！");
	}
  
  //重写toString方法，输出的表现形式不同（输出shape,color,taste）
  @Override
	public String toString() {

	  String str = "杨梅的信息：果实为" + this.getShape() + "、" + this.getColor() 
	  				+ "，" + this.getTaste() + "，非常好吃！";
	  return str;
	}
}
