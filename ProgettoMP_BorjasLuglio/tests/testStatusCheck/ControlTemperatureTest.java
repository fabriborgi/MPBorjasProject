package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import statusCheck.ControlTemperature;

public class ControlTemperatureTest {

	private ControlTemperature controlTemperature;

	@Before
	public void setUp() {
		controlTemperature = new ControlTemperature(25);
	}

	@Test
	public void testTemperatureNormal() {
		assertTrue(controlTemperature.check(controlTemperature));
	}

	@Test
	public void testTemperatureHigh() {
		ControlTemperature highTemperature = new ControlTemperature(85);
		assertFalse(highTemperature.check(highTemperature));
	}

	@Test
	public void testTemperatureLow() {
		ControlTemperature lowTemperature = new ControlTemperature(-5);
		assertTrue(lowTemperature.check(lowTemperature));
	}
}
