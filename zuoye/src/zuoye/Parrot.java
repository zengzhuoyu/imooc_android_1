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

		return "�ó�ģ��";
	}

	@Override
	public String love() {

		return "ϲ���Լ��������";
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
