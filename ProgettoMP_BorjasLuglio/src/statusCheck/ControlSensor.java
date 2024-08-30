package statusCheck;

public class ControlSensor extends VerifySatellite {
	private boolean value;

	public ControlSensor(boolean value) {
		this.value = value;
	}
	
	public boolean check (ControlSensor sensor, ControlTemperature temperature, ControlEnergy energy) {
	
		if(!value) {
			System.out.println("Sensor does not produce data, may have been damaged!");
			return false;
		}
		return verifyStatusSatellite(sensor, temperature, energy);
	}
	
}
