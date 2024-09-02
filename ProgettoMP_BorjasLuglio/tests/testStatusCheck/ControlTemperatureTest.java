package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import statusCheck.ControlTemperature;

public class ControlTemperatureTest {
    
    private ControlTemperature controlTemperature;

    @Before
    public void setUp() {
        controlTemperature = new ControlTemperature(25); // Temperatura normale
    }

    @Test
    public void testTemperatureNormal() {
        // Verifica che il controllo passi con una temperatura normale
        assertTrue(controlTemperature.check(controlTemperature));
    }

    @Test
    public void testTemperatureHigh() {
        // Verifica che il controllo fallisca con una temperatura troppo alta
        ControlTemperature highTemperature = new ControlTemperature(85);
        assertFalse(highTemperature.check(highTemperature));
    }

    @Test
    public void testTemperatureLow() {
        // Verifica che il controllo passi anche se la temperatura è troppo bassa
        ControlTemperature lowTemperature = new ControlTemperature(-5);
        assertTrue(lowTemperature.check(lowTemperature));
    }
}
