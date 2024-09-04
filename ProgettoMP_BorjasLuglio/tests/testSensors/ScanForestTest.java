package testSensors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import sensors.ScanForest;

public class ScanForestTest {

	private ScanForest scanForest;

	@Before
	public void init() {
		scanForest = new ScanForest(22.2, 2.0, "Stormy", "Pine");
	}

	@Test
	public void testGetCategoryTree() {
		assertEquals("Pine", scanForest.getCategoryTree());
	}

	@Test
	public void testSetCategoryTree() {
		scanForest.setCategoryTree("Oak");
		assertEquals("Oak", scanForest.getCategoryTree());
	}
}
