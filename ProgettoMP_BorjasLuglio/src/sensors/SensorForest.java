package sensors;

public class SensorForest implements SensorInterface {

	@Override
	public void createSensor() {
		System.out.println("Preparation forest scan");
	}

	@Override
	public void parameters() {
		System.out.println("The forest is being scanned");

	}

}
