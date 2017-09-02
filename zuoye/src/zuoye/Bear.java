package zuoye;

public class Bear extends Animal implements IAct {
	
	public Bear() {}
	public Bear(String name,int age) {
		super(name,age);
	}
	
	@Override
	public String skill() {
		
		return "挽着花篮，打着雨伞，自立走秀";

	}

	@Override
	public String love() {
		
		return "喜欢卖萌";
	}
	
	@Override
	public String act() {
		String content = "表演者：" + this.getName()
		
		+ "\n年龄：" + this.getAge() + "岁"
		+ "\n技能：" + this.skill()
		+ "\n爱好：" + this.love();//原因不明的时候，就把全部写完再查看
		
		return content;
		
	}

}
