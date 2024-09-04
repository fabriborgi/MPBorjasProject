package testStatusCheck;

import org.junit.Test;

import statusCheck.ControlEnergy;
import statusCheck.ControlSensor;
import statusCheck.ControlTemperature;

import static org.junit.Assert.*;

public class VerifySatelliteTest {

    @Test
    public void testFullChainSuccess() {
        // Crea gli oggetti della catena
        ControlEnergy energy = new ControlEnergy(250); // Energia sufficiente
        ControlSensor sensor = new ControlSensor(true); // Sensore funzionante
        ControlTemperature temperature = new ControlTemperature(25); // Temperatura normale

        // Configura la catena
        energy.setNext(sensor);
        sensor.setNext(temperature);

        // Testa l'intera catena
        assertTrue(energy.check(energy));
    }

    @Test
    public void testChainFailsAtEnergy() {
        // Energia insufficiente
        ControlEnergy energy = new ControlEnergy(230);
        ControlSensor sensor = new ControlSensor(true);
        ControlTemperature temperature = new ControlTemperature(25);

        energy.setNext(sensor);
        sensor.setNext(temperature);

        // La catena dovrebbe fallire al primo handler
        assertFalse(energy.check(energy));
    }



    @Test
    public void testChainHandlesAll() {
        // Energia non sufficiente, la catena dovrebbe fermarsi immediatamente
        ControlEnergy energy = new ControlEnergy(200);
        ControlSensor sensor = new ControlSensor(true);
        ControlTemperature temperature = new ControlTemperature(25);

        energy.setNext(sensor);
        sensor.setNext(temperature);

        // La catena fallisce al primo controllo
        assertFalse(energy.check(energy));

        // Cambia l'energia per renderla sufficiente
        energy = new ControlEnergy(250);

        // Riprova con energia sufficiente
        assertTrue(energy.check(energy));
    }
}
