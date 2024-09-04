package testSensors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import sensors.Satellite;

public class SatelliteTest {

    private Satellite satellite;

    @Before
    public void init() {
        satellite = new Satellite(22.2, 2.0, "Stormy");
    }

    @Test
    public void testScanNormalRange() {
        // Imposta una condizione che restituisce un valore dell'area nella gamma normale
        satellite = new Satellite(10, 100, "Clear");
        assertEquals("this area has a level in the normal range", satellite.scan());
    }

    @Test
    public void testScanNeedsIntervention() {
        // Imposta una condizione che restituisce un valore dell'area che richiede intervento
        satellite = new Satellite(100, 1, "Stormy");
        assertEquals("this area needs intervention", satellite.scan());
    }

    @Test
    public void testCalculateWeatherSnowy() {
        satellite.setWeather("Snowy");
        satellite.calculateWeather();
        assertEquals(10, satellite.getWeatherValue());
    }

    @Test
    public void testCalculateWeatherRainy() {
        satellite.setWeather("Rainy");
        satellite.calculateWeather();
        assertEquals(5, satellite.getWeatherValue());
    }

    @Test
    public void testCalculateWeatherWindy() {
        satellite.setWeather("Windy");
        satellite.calculateWeather();
        assertEquals(5, satellite.getWeatherValue());
    }

    @Test
    public void testCalculateWeatherSunny() {
        satellite.setWeather("Sunny");
        satellite.calculateWeather();
        assertEquals(1, satellite.getWeatherValue());
    }

    @Test
    public void testFormulaParameterCheckArea() {
        satellite.calculateWeather();
        double result = satellite.formulaParameterCheckArea();
        assertEquals(111, result, 0.01);
    }
}
