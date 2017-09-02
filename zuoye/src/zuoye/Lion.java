package zuoye;

public class Lion extends Animal implements IAct {

	private String color;
	private String sex;
	
	public Lion() {}
	public Lion(String name,int age,String color,String sex) {
		super(name,age);
		this.setColor(color);
		this.setSex(sex);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String skill() {
		
		return "擅长钻火圈";
	}

	@Override
	public String love() {
		
		return "喜欢吃各种肉类";
	}
	
	@Override
	public String act() {
		String content = "表演者：" + this.getName()
		+ "\n年龄：" + this.getAge() + "岁"
		+ "\n性别：" + this.getSex()
		+ "\n毛色：" + this.getColor()
		+ "\n技能：" + this.skill()
		+ "\n爱好：" + this.love();
		
		return content;
		
	}	

}
