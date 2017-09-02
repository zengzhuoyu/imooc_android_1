package zuoye;

public abstract class Animal {

	private String name;
	private int age;
	
	public Animal() {}
	public Animal(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//����
	public abstract String love();//д���̳з�����ʱ��ǵ������ǲ����з���ֵ
}
