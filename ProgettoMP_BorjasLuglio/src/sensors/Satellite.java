package sensors;

import java.util.ArrayList;
import java.util.List;

import basements.Basement;

public class Satellite {
	private double grades;
	private double sizeArea;
	private String weatherType;
	private int weatherValue = 0;
	private List<Basement> basements = new ArrayList<>();

	public Satellite(double grades, double sizeArea, String weatherType) {
		super();
		this.grades = grades;
		this.sizeArea = sizeArea;
		this.weatherType = weatherType;
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

	public String getWeatherType() {
		return weatherType;
	}
	public int getWeatherValue() {
		return weatherValue;
	}
	public void setWeather(String weather) {
		this.weatherType = weather;
	}

	public String scan() {
		
		if (formulaParameterCheckArea() > 150)
			return "this area needs intervention";
		return "this area has a level in the normal range";
	}

	public void calculateWeather() {
		if (weatherType.equals("Snowy") || weatherType.equals("Stormy"))
			weatherValue = 10;
		else if (weatherType.equals("Rainy") || weatherType.equals("Windy"))
			weatherValue = 5;
		else
			weatherValue++;
	}

	public double formulaParameterCheckArea() {
		calculateWeather();
		return (weatherValue * grades) / sizeArea;
	}
	
	

}
