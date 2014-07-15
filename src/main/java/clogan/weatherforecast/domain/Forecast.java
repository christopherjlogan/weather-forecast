package clogan.weatherforecast.domain;

public class Forecast {
	
	private String city;
	private double temp;
	
	public Forecast() {
		
	}
	
	public Forecast(String city, double temp) {
		this.setCity(city);
		this.setTemp(temp);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	
}
