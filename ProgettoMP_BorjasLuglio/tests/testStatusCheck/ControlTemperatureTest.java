package testStatusCheck;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import statusCheck.ControlTemperature;

public class ControlTemperatureTest {

    private ControlTemperature lowTempControl;
    private ControlTemperature highTempControl;
    private ControlTemperature normalTempControl;

    @Before
    public void setUp() {
        lowTempControl = new ControlTemperature(0);
        highTempControl = new ControlTemperature(90);
        normalTempControl = new ControlTemperature(25);
    }

    @Test
    public void testCheckHighTemperature() {
        assertFalse(highTempControl.check(new ControlTemperature(90)));
    }

    @Test
    public void testCheckLowTemperature() {
        assertTrue(lowTempControl.check(new ControlTemperature(0)));
    }

    @Test
    public void testCheckNormalTemperature() {
        assertTrue(normalTempControl.check(new ControlTemperature(25)));
    }
}
