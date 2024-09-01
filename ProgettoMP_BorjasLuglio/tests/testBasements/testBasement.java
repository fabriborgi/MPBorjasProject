package testBasements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import basements.Basement;
import sensors.Satellite;

public class testBasement {

    private Basement basement;
    private MockSatellite satellite;

    // Classe interna per simulare il comportamento di Satellite
    private class MockSatellite implements Satellite {
        private String scanResult;

        public MockSatellite(String scanResult) {
            this.scanResult = scanResult;
        }

        @Override
        public String scan() {
            return scanResult;
        }

        // Aggiungiamo un metodo per cambiare il risultato di scan
        public void setScanResult(String scanResult) {
            this.scanResult = scanResult;
        }
    }

    @Before
    public void setUp() {
        // Creiamo un'istanza di MockSatellite con un risultato predefinito
        satellite = new MockSatellite("No issues detected");
        // Creiamo un'istanza di Basement usando il mock di Satellite
        basement = new Basement("Florence", satellite);
    }

    @Test
    public void testGetLocation() {
        assertEquals("Florence", basement.getLocation());
    }

    @Test
    public void testSetLocation() {
        basement.setLocation("Rome");
        assertEquals("Rome", basement.getLocation());
    }

    @Test
    public void testUpdate() {
        satellite.setScanResult("All systems operational");
        basement.update();
        assertEquals("All systems operational", satellite.scan());
    }
}
