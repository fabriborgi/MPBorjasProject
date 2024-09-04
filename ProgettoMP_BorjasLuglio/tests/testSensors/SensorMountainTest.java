package testSensors;

import org.junit.Before;
import org.junit.Test;
import sensors.SensorMountain;

public class SensorMountainTest {

	private SensorMountain sensorMountain;

	@Before
	public void init() {
		sensorMountain = new SensorMountain();
	}

	@Test
	public void testCreateSensor() {
		sensorMountain.createSensor();
	}

	@Test
	public void testParameters() {
		sensorMountain.parameters();
	}
}
