package statusCheck;

public class ControlSensor extends VerifySatellite {
    private boolean value;

    public ControlSensor(boolean value) {
        this.value = value;
    }

    @Override
    public boolean check(Object param) {
        // Assicura che il parametro sia del tipo corretto
        if (param instanceof ControlSensor) {
            ControlSensor sensor = (ControlSensor) param;

            if (!sensor.value) {
                System.out.println("Sensor does not produce data, may have been damaged!");
                return false;
            }
        }

        // Passa al prossimo handler
        VerifySatellite next = getNext();
        if (next != null) {
            return next.check(new ControlTemperature(25)); // Passa l'oggetto successivo per il controllo
        }
        return true;
    }
}
