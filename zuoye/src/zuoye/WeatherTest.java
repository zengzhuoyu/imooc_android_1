package zuoye;

public class WeatherTest {

	public static void main(String[] args) {
		
		Weather weather = new Weather();
		
		new Thread(new GenerateWeather(weather)).start();
		new Thread(new ReadWeather(weather)).start();
	}

}
