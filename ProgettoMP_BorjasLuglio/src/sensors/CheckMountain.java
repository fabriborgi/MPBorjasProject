package sensors;

public class CheckMountain extends Satellite{
	
	public CheckMountain(double grades, double sizeArea, String weatherType) {
		super(grades, sizeArea, weatherType);
		// TODO Auto-generated constructor stub
	}

	public SensorInterface sensor;

	public void scanning() {
		SensorInterface s = sensor;
		s.createSensor(); // quando si punta ilsensore
		System.out.println("sparando sonda");
		s.parameters();// da eseguire ogni volta che si riperlustra la zona
		System.out.println("riaggiorno zona");
	}

}