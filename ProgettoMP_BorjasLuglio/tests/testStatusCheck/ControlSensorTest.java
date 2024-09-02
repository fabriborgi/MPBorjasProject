package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import statusCheck.ControlSensor;

public class ControlSensorTest {
    
    private ControlSensor controlSensor;

    @Before
    public void setUp() {
        controlSensor = new ControlSensor(true); // Sensore attivo
    }

    @Test
    public void testSensorActive() {
        // Verifica che il controllo passi con un sensore attivo
        assertTrue(controlSensor.check(controlSensor));
    }

    @Test
    public void testSensorInactive() {
        // Verifica che il controllo fallisca con un sensore inattivo
        ControlSensor inactiveSensor = new ControlSensor(false);
        assertFalse(inactiveSensor.check(inactiveSensor));
    }
}
