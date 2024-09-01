package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import statusCheck.ControlEnergy;
import statusCheck.ControlSensor;
import statusCheck.ControlTemperature;

public class ControlEnergyTest {

    private ControlEnergy controlEnergy;
    private ControlSensor controlSensor;
    private ControlTemperature controlTemperature;

    @Before
    public void setUp() {
        // Imposta un contesto di test predefinito
        controlSensor = new ControlSensor(true);
        controlTemperature = new ControlTemperature(50); // Una temperatura normale
    }

    @Test
    public void testCheckLowEnergy() {
        controlEnergy = new ControlEnergy(200); // kWh sotto il livello minimo
        assertFalse("Energy is not sufficient to aliment the sensor!", 
                     controlEnergy.check(controlSensor, controlTemperature, controlEnergy));
    }

    @Test
    public void testCheckHighEnergy() {
        controlEnergy = new ControlEnergy(310); // kWh sopra il livello massimo
        // Non stiamo verificando l'output, quindi ci concentriamo sul fatto che la funzione ritorni true
        assertTrue(controlEnergy.check(controlSensor, controlTemperature, controlEnergy));
    }

    @Test
    public void testCheckNormalEnergy() {
        controlEnergy = new ControlEnergy(250); // kWh in un range normale
        assertTrue(controlEnergy.check(controlSensor, controlTemperature, controlEnergy));
    }
}
