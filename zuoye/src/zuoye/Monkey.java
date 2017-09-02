package zuoye;

public class Monkey extends Animal implements IAct {

	private String type;
	
	public Monkey() {}
	public Monkey(String name,int age,String type) {
		super(name,age);
		this.setType(type);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String skill() {

		return "骑独轮车过独木桥";

	}

	@Override
	public String love() {
		
		return "喜欢模仿人的动作表情";
		
	}
	
	@Override
	public String act() {
		
		String content = "表演者：" + this.getName()
		+ "\n年龄：" + this.getAge() + "岁"
		+ "\n品种：" + this.getType()
		+ "\n技能：" + this.skill()
		+ "\n爱好：" + this.love();
		
		return content;
		
	}

}
