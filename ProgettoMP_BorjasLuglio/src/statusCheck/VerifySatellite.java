package statusCheck;

public abstract class VerifySatellite {
	private VerifySatellite next;

	public boolean verifyStatusSatellite(ControlSensor sensor, ControlTemperature temperature, ControlEnergy energy) {
		if (next == null) {
			return true;

		}

		return next.verifyStatusSatellite(sensor, temperature, energy);
	}

}
