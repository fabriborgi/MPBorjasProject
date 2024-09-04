package testStatusCheck;

import org.junit.Test;

import statusCheck.ControlEnergy;
import statusCheck.ControlSensor;
import statusCheck.ControlTemperature;

import static org.junit.Assert.*;

public class VerifySatelliteTest {

	@Test
	public void testFullChainSuccess() {
		ControlEnergy energy = new ControlEnergy(250);
		ControlSensor sensor = new ControlSensor(true);
		ControlTemperature temperature = new ControlTemperature(25);

		energy.setNext(sensor);
		sensor.setNext(temperature);

		assertTrue(energy.check(energy));
	}

	@Test
	public void testChainFailsAtEnergy() {
		ControlEnergy energy = new ControlEnergy(230);
		ControlSensor sensor = new ControlSensor(true);
		ControlTemperature temperature = new ControlTemperature(25);

		energy.setNext(sensor);
		sensor.setNext(temperature);

		assertFalse(energy.check(energy));
	}

	@Test
	public void testChainHandlesAll() {
		ControlEnergy energy = new ControlEnergy(200);
		ControlSensor sensor = new ControlSensor(true);
		ControlTemperature temperature = new ControlTemperature(25);

		energy.setNext(sensor);
		sensor.setNext(temperature);

		assertFalse(energy.check(energy));

		energy = new ControlEnergy(250);

		assertTrue(energy.check(energy));
	}
}
