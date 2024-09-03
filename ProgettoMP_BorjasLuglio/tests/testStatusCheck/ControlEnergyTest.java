package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import statusCheck.ControlEnergy;

public class ControlEnergyTest {

	private ControlEnergy controlEnergy;

	@Before
	public void setUp() {
		controlEnergy = new ControlEnergy(250);
	}

	@Test
	public void testEnergySufficient() {
		assertTrue(controlEnergy.check(new ControlEnergy(250)));
	}

	@Test
	public void testEnergyInsufficient() {
		ControlEnergy lowEnergy = new ControlEnergy(230);
		assertFalse(lowEnergy.check(lowEnergy));
	}

	@Test
	public void testEnergyOverloaded() {
		ControlEnergy highEnergy = new ControlEnergy(310);
		assertTrue(highEnergy.check(highEnergy));
	}
}
