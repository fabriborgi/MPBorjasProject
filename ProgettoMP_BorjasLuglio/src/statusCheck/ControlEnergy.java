package statusCheck;

public class ControlEnergy extends VerifySatellite {
    private int kWh;

    public ControlEnergy(int kWh) {
        this.kWh = kWh;
    }

    @Override
    public boolean check(Object param) {
        // Assicura che il parametro sia del tipo corretto
        if (param instanceof ControlEnergy) {
            ControlEnergy energy = (ControlEnergy) param;

            if (energy.kWh < 240) {
                System.out.println("Energy is not sufficient to aliment the sensor!");
                return false;
            } else if (energy.kWh > 300) {
                System.out.println("Satellite is overloaded, please turn off the sensor to avoid damaging it.");
            }
        }

        // Passa al prossimo handler
        VerifySatellite next = getNext();
        if (next != null) {
            return next.check(new ControlSensor(true)); // Passa l'oggetto successivo per il controllo
        }
        return true;
    }
}
