package testStatusCheck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import statusCheck.ControlEnergy;

public class ControlEnergyTest {
    
    private ControlEnergy controlEnergy;

    @Before
    public void setUp() {
        controlEnergy = new ControlEnergy(250); // Valore di energia valido
    }

    @Test
    public void testEnergySufficient() {
        // Verifica che il controllo passi con energia sufficiente
        assertTrue(controlEnergy.check(new ControlEnergy(250)));
    }

    @Test
    public void testEnergyInsufficient() {
        // Verifica che il controllo fallisca con energia insufficiente
        ControlEnergy lowEnergy = new ControlEnergy(230);
        assertFalse(lowEnergy.check(lowEnergy));
    }

    @Test
    public void testEnergyOverloaded() {
        // Verifica che il controllo passi anche se il satellite è sovraccaricato
        ControlEnergy highEnergy = new ControlEnergy(310);
        assertTrue(highEnergy.check(highEnergy));
    }
}
