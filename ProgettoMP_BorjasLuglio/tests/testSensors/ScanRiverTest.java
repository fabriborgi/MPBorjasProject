package testSensors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import sensors.ScanRiver;

public class ScanRiverTest {

	private ScanRiver scanRiver;

	@Before
	public void init() {
		scanRiver = new ScanRiver(22.2, 2.0, "Stormy", 15.5f);
	}

	@Test
	public void testGetTemperatureWater() {
		assertEquals(15.5f, scanRiver.getTemperatureWater(), 0);
	}

	@Test
	public void testSetTemperatureWater() {
		scanRiver.setTemperatureWater(20.0f);
		assertEquals(20.0f, scanRiver.getTemperatureWater(), 0);
	}
}
