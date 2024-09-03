package sensors;

public class SensorRiver implements SensorInterface {

	@Override
	public void createSensor() {
		System.out.println("Preparation mountain scan");
	}

	@Override
	public void parameters() {
		System.out.println("The river is being scanned");

	}

}
