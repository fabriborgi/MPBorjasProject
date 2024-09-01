package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import statusCheck.ControlEnergy;
import statusCheck.ControlSensor;
import statusCheck.ControlTemperature;

public class ControlSensorTest {

    private ControlEnergy controlEnergy;
    private ControlSensor controlSensor;
    private ControlTemperature controlTemperature;

    @Before
    public void setUp() {
        // Inizializza i controlli di default
        controlEnergy = new ControlEnergy(250); // Energia normale
        controlTemperature = new ControlTemperature(50); // Temperatura normale
    }

    @Test
    public void testCheckSensorNotWorking() {
        controlSensor = new ControlSensor(false); // Sensore danneggiato
        assertFalse("Sensor does not produce data, may have been damaged!", 
                    controlSensor.check(controlSensor, controlTemperature, controlEnergy));
    }

    @Test
    public void testCheckSensorWorking() {
        controlSensor = new ControlSensor(true); // Sensore funziona
        assertTrue(controlSensor.check(controlSensor, controlTemperature, controlEnergy));
    }
}
