package zuoye;

public class Weather {

	private int temperature;
	private int humidity;
	private boolean flag = false;
	
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {		
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public synchronized void generate() {
		
		if(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//生成温度
		temperature = (int)(Math.random() * 40 + 1);//0取不到?
		setTemperature(temperature);
		//湿度
		humidity = (int)(Math.random() * 100 + 1);
		setHumidity(humidity);
		
		flag = true;
		notifyAll();
		
		System.out.println("生成天气的数据 " + toString());
		
	}
	
	public synchronized void read() {
		
		if(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		flag = false;
		notifyAll();
		
		System.out.println("读取天气的数据 " + toString());
	}	
	
	@Override
	public String toString() {
		return "[温度：" + temperature + ", 湿度：" + humidity + "]";
	}
	
}
