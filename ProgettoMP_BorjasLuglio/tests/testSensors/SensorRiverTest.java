package testSensors;

import org.junit.Before;
import org.junit.Test;
import sensors.SensorRiver;

public class SensorRiverTest {

	private SensorRiver sensorRiver;

	@Before
	public void init() {
		sensorRiver = new SensorRiver();
	}

	@Test
	public void testCreateSensor() {
		sensorRiver.createSensor();
	}

	@Test
	public void testParameters() {
		sensorRiver.parameters();
	}
}
