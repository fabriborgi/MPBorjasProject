package testStatusCheck;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import statusCheck.ControlSensor;

public class ControlSensorTest {

	private ControlSensor faultySensor;
	private ControlSensor workingSensor;

	@Before
	public void setUp() {
		faultySensor = new ControlSensor(false);
		workingSensor = new ControlSensor(true);
	}

	@Test
	public void testCheckFaultySensor() {
		assertFalse(faultySensor.check(new ControlSensor(false)));
	}

	@Test
	public void testCheckWorkingSensor() {
		assertTrue(workingSensor.check(new ControlSensor(true)));
	}
}
