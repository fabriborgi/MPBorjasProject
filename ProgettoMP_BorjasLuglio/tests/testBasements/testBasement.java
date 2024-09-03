package testBasements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import basements.Basement;
import sensors.Satellite;

public class testBasement {

	private Basement basement;
	private Satellite satellite;

	@Before
	public void init() {
		satellite = new Satellite(22.2, 2.0, "Stormy");

		basement = new Basement("Main Street", satellite);
	}

	@Test
	public void testGetLocation() {
		assertEquals("Main Street", basement.getLocation());
	}

	@Test
	public void testSetLocation() {
		basement.setLocation("Elm Street");
		assertEquals("Elm Street", basement.getLocation());
	}

	@Test
	public void testUpdate() {
		try {
			basement.update();
		} catch (Exception e) {
			fail("The update method should not throw an exception");
		}
	}
}
