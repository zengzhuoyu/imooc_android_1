package zuoye;

public class Bear extends Animal implements IAct {
	
	public Bear() {}
	public Bear(String name,int age) {
		super(name,age);
	}
	
	@Override
	public String skill() {
		
		return "���Ż�����������ɡ����������";

	}

	@Override
	public String love() {
		
		return "ϲ������";
	}
	
	@Override
	public String act() {
		String content = "�����ߣ�" + this.getName()
		
		+ "\n���䣺" + this.getAge() + "��"
		+ "\n���ܣ�" + this.skill()
		+ "\n���ã�" + this.love();//ԭ������ʱ�򣬾Ͱ�ȫ��д���ٲ鿴
		
		return content;
		
	}

}
