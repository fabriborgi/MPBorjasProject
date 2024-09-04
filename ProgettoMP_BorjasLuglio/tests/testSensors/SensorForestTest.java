package testSensors;

import org.junit.Before;
import org.junit.Test;
import sensors.SensorForest;

public class SensorForestTest {

	private SensorForest sensorForest;

	@Before
	public void init() {
		sensorForest = new SensorForest();
	}

	@Test
	public void testCreateSensor() {
		sensorForest.createSensor();
	}

	@Test
	public void testParameters() {
		sensorForest.parameters();
	}
}
