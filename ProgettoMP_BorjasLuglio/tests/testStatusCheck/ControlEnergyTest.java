package testStatusCheck;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import statusCheck.ControlEnergy;

public class ControlEnergyTest {

    private ControlEnergy lowEnergyControl;
    private ControlEnergy highEnergyControl;
    private ControlEnergy adequateEnergyControl;

    @Before
    public void setUp() {
        lowEnergyControl = new ControlEnergy(200);
        highEnergyControl = new ControlEnergy(350);
        adequateEnergyControl = new ControlEnergy(250);
    }

    @Test
    public void testCheckLowEnergy() {
        assertFalse(lowEnergyControl.check(new ControlEnergy(200)));
    }

    @Test
    public void testCheckHighEnergy() {
        assertTrue(highEnergyControl.check(new ControlEnergy(350)));
    }

    @Test
    public void testCheckAdequateEnergy() {
        assertTrue(adequateEnergyControl.check(new ControlEnergy(250)));
    }
}
