package zuoye;

public class ReadWeather implements Runnable{
	
	Weather weather;
	
	public ReadWeather(Weather weather){
		this.weather = weather;
	}

	@Override
	public void run() {
		int i = 0;
		while(i < 100){
			weather.read();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
