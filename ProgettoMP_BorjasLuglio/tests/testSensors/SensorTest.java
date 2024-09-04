package testSensors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sensors.Satellite;

public class SensorTest {

	private Satellite satellite;

	@Before
	public void initSatellite() {
		satellite = new Satellite(22.2, 2.0, "Stormy");
	}

	@Test
	public void testformulaParameterCheckArea() {
		assertEquals(satellite.formulaParameterCheckArea(), ((22.2 * 10) / 2), 0);
	}

	@Test
	public void testcalculateWeather() {
		satellite.calculateWeather();
		assertEquals(10, satellite.getWeatherValue());
	}

	@Test
	public void testScan() {
		assertSame("this area has a level in the normal range", satellite.scan());
	}
}
