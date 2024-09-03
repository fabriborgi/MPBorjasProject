package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import statusCheck.ControlSensor;

public class ControlSensorTest {

	private ControlSensor controlSensor;

	@Before
	public void setUp() {
		controlSensor = new ControlSensor(true);
	}

	@Test
	public void testSensorActive() {
		assertTrue(controlSensor.check(controlSensor));
	}

	@Test
	public void testSensorInactive() {
		ControlSensor inactiveSensor = new ControlSensor(false);
		assertFalse(inactiveSensor.check(inactiveSensor));
	}
}
