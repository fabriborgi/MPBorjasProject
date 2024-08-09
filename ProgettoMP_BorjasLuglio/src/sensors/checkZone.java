package sensors;

public abstract class checkZone {
	public SensorInterface sensor;

	public void scanning() {
		SensorInterface s = sensor;
		s.createSensor(); // quando si punta ilsensore
		System.out.println("sparando sonda");
		s.parameters();// da eseguire ogni volta che si riperlustra la zona
		System.out.println("riaggiorno zona");
	}

}
