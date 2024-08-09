package sensors;

public class Satellite extends checkZone {
	private double grades;
	private double sizeArea;
	private String weather;
	private int weatherValue = 0;

	public Satellite(double grades, double sizeArea, String weather) {
		super();
		this.grades = grades;
		this.sizeArea = sizeArea;
		this.weather = weather;
	}

	public double getGrades() {
		return grades;
	}

	public void setGrades(double grades) {
		this.grades = grades;
	}

	public double getSizeArea() {
		return sizeArea;
	}

	public void setSizeArea(double sizeArea) {
		this.sizeArea = sizeArea;
	}

	public String getWeather() {
		return weather;
	}
	public int getWeatherValue() {
		return weatherValue;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String scan() {
		if (formulaParameterCheckArea() > 150)
			return "this area needs intervention";
		return "this area has a level in the normal range";
	}

	public void calculateWeather() {
		if (weather.equals("Snowy") || weather.equals("Stormy"))
			weatherValue = 10;
		else if (weather.equals("Rainy") || weather.equals("Windy"))
			weatherValue = 5;
		else
			weatherValue++;
	}

	public double formulaParameterCheckArea() {
		calculateWeather();
		return (weatherValue * grades) / sizeArea;
	}

}
