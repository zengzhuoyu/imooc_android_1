package zuoye;

public class Clown implements IAct {

	private String name;
	private int years;
	
	public Clown() {}
	public Clown(String name,int years) {
		this.setName(name);
		this.setYears(years);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String skill() {

		return "�Ųȸ��Σ������Ӽ�ħ������";
	}
	
	//��װ
	public String dress() {
		
		return "����ʷ�װ��ͷ�ϴ��Ų�ɫ��ñ�ӣ��������ſ��ŵĲ�ױ";
	}
	
	@Override
	public String act() {
		
		String content = "�����ߣ�" + this.getName()
		+ "\n���䣺" + this.getYears() + "��"
		+ "\n��װ��" + this.dress()
		+ "\n���ܣ�" + this.skill();
		
		return content;
		
	}		

}
