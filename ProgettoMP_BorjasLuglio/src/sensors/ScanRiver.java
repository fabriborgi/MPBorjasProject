package sensors;

public class ScanRiver extends Satellite {

	private float temperatureWater;

	public ScanRiver(double grades, double sizeArea, String weatherType, float temperatureWater) {
		super(grades, sizeArea, weatherType);
		this.temperatureWater = temperatureWater;
	}

	public float getTemperatureWater() {
		return temperatureWater;
	}

	public void setTemperatureWater(float temperatureWater) {
		this.temperatureWater = temperatureWater;
	}

}
