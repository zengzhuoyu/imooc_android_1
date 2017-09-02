package zuoye;

public class Parrot extends Animal implements IAct {

	private String type;
	
	public Parrot() {}
	public Parrot(String name,int age,String type) {
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

		return "擅长模仿";
	}

	@Override
	public String love() {

		return "喜欢吃坚果和松子";
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
