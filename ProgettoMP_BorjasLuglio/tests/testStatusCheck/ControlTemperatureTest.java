package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import statusCheck.ControlEnergy;
import statusCheck.ControlSensor;
import statusCheck.ControlTemperature;

public class ControlTemperatureTest {

    private ControlEnergy controlEnergy;
    private ControlSensor controlSensor;
    private ControlTemperature controlTemperature;

    @Before
    public void setUp() {
        // Imposta i valori predefiniti
        controlEnergy = new ControlEnergy(250); // Energia normale
        controlSensor = new ControlSensor(true); // Sensore funzionante
    }

    @Test
    public void testCheckHighTemperature() {
        controlTemperature = new ControlTemperature(90); // Temperatura troppo alta
        assertFalse("The sensor is overheated!", 
                    controlTemperature.check(controlSensor, controlTemperature, controlEnergy));
    }

    @Test
    public void testCheckLowTemperature() {
        controlTemperature = new ControlTemperature(-10); // Temperatura troppo bassa
        assertTrue(controlTemperature.check(controlSensor, controlTemperature, controlEnergy));
    }

    @Test
    public void testCheckNormalTemperature() {
        controlTemperature = new ControlTemperature(50); // Temperatura normale
        assertTrue(controlTemperature.check(controlSensor, controlTemperature, controlEnergy));
    }
}
