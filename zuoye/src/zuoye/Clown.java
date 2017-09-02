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

		return "脚踩高跷，进行杂技魔术表演";
	}
	
	//着装
	public String dress() {
		
		return "身穿五彩服装，头上戴着彩色的帽子，脸上面着夸张的彩妆";
	}
	
	@Override
	public String act() {
		
		String content = "表演者：" + this.getName()
		+ "\n艺龄：" + this.getYears() + "年"
		+ "\n着装：" + this.dress()
		+ "\n技能：" + this.skill();
		
		return content;
		
	}		

}
