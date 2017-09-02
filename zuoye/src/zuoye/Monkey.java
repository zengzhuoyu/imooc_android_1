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

		return "����ֳ�����ľ��";

	}

	@Override
	public String love() {
		
		return "ϲ��ģ���˵Ķ�������";
		
	}
	
	@Override
	public String act() {
		
		String content = "�����ߣ�" + this.getName()
		+ "\n���䣺" + this.getAge() + "��"
		+ "\nƷ�֣�" + this.getType()
		+ "\n���ܣ�" + this.skill()
		+ "\n���ã�" + this.love();
		
		return content;
		
	}

}
