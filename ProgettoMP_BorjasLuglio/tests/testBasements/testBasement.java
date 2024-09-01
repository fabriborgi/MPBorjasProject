package testBasements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import basements.Basement;
import sensors.Satellite;

public class testBasement {

    private Basement basement;
    private Satellite satellite;

    @Before
    public void init() {
        // Inizializza il satellite come nel test originale
        satellite = new Satellite(22.2, 2.0, "Stormy");
        
        // Inizializza il basement con la location e il satellite creato
        basement = new Basement("Main Street", satellite);
    }

    @Test
    public void testGetLocation() {
        // Verifica che il getter restituisca la location corretta
        assertEquals("Main Street", basement.getLocation());
    }

    @Test
    public void testSetLocation() {
        // Modifica la location e verifica che il cambiamento sia corretto
        basement.setLocation("Elm Street");
        assertEquals("Elm Street", basement.getLocation());
    }

    @Test
    public void testUpdate() {
        // Poiché il metodo update stampa a console, non possiamo testare direttamente l'output
        // Ma possiamo verificare se il metodo satellite.scan() viene chiamato correttamente
        // Qui semplicemente controlliamo che non venga sollevata un'eccezione
        try {
            basement.update();
        } catch (Exception e) {
            fail("The update method should not throw an exception");
        }
    }
}
