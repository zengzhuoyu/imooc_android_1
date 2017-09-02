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
		
		return "�ó����Ȧ";
	}

	@Override
	public String love() {
		
		return "ϲ���Ը�������";
	}
	
	@Override
	public String act() {
		String content = "�����ߣ�" + this.getName()
		+ "\n���䣺" + this.getAge() + "��"
		+ "\n�Ա�" + this.getSex()
		+ "\nëɫ��" + this.getColor()
		+ "\n���ܣ�" + this.skill()
		+ "\n���ã�" + this.love();
		
		return content;
		
	}	

}
