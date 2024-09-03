package sensors;

public class SensorMountain implements SensorInterface {

	@Override
	public void createSensor() {
		System.out.println("Preparation mountain scan");
	}

	@Override
	public void parameters() {
		System.out.println("The mountain is being scanned");

	}

}
