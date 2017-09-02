package zuoye;

public class GenerateWeather implements Runnable{
	
	Weather weather;
	
	public GenerateWeather(Weather weather){
		this.weather = weather;
	}

	@Override
	public void run() {
		int i = 0;
		while(i < 100){
			weather.generate();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
