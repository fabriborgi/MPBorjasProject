package testSensors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import sensors.ScanMountain;

public class ScanMountainTest {

	private ScanMountain scanMountain;

	@Before
	public void init() {
		scanMountain = new ScanMountain(22.2, 2.0, "Stormy", 2000);
	}

	@Test
	public void testGetAboveSeaLevel() {
		assertEquals(2000, scanMountain.getAboveSeaLevel());
	}

	@Test
	public void testSetAboveSeaLevel() {
		scanMountain.setAboveSeaLevel(2500);
		assertEquals(2500, scanMountain.getAboveSeaLevel());
	}
}
