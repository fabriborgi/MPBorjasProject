package statusCheck;

public class ControlTemperature extends VerifySatellite {
	private int checkTemperature;

	public ControlTemperature(int checkTemperature) {
		this.checkTemperature = checkTemperature;
	}

	public boolean check(ControlSensor sensor, ControlTemperature temperature, ControlEnergy energy) {

		if (checkTemperature > 80) {
			System.out.println("The sensor is overheated!");
			return false;
		} else if (checkTemperature < 1) {
			System.out.println("The sensor may be broken!");
		}

		return verifyStatusSatellite(sensor, temperature, energy);
	}
}
