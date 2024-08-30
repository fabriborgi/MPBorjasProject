package statusCheck;

public class ControlEnergy extends VerifySatellite {
	private int kWh;

	public ControlEnergy(int kWh) {
		this.kWh = kWh;
	}
	
	public boolean check  (ControlSensor sensor, ControlTemperature temperature, ControlEnergy energy) {
		if(kWh<240) {
			System.out.println("Energy is not sufficent to alliment the sensor!");
			return false;
		}
		else if (kWh>300) {
			System.out.println("Satellite is overloaded, please turn off the sensor to avoid damaging it.");
		}
		
		return verifyStatusSatellite(sensor, temperature, energy); 
	}

}
