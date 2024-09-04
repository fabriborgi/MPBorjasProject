package basements;

import sensors.Satellite;

public class Basement implements BasementsInterface {

	private String location;
	private Satellite satellite;

	public Basement(String location, Satellite satellite) {
		super();
		this.location = location;
		this.satellite = satellite;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void update() {
		System.out.println("Receving new datas from satellite saying: " + satellite.scan() + "status satellite:");
	}

}
