package statusCheck;

public class ControlSensor extends VerifySatellite {
	private boolean value;

	public ControlSensor(boolean value) {
		this.value = value;
	}

	@Override
	public boolean check(Object param) {
		if (param instanceof ControlSensor) {
			ControlSensor sensor = (ControlSensor) param;

			if (!sensor.value) {
				System.out.println("Sensor does not produce data, may have been damaged!");
				return false;
			}
		}

		VerifySatellite next = getNext();
		if (next != null) {
			return next.check(new ControlTemperature(25));
		}
		return true;
	}
}
