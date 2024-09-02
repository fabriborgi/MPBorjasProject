package statusCheck;

public class ControlTemperature extends VerifySatellite {
    private int checkTemperature;

    public ControlTemperature(int checkTemperature) {
        this.checkTemperature = checkTemperature;
    }

    @Override
    public boolean check(Object param) {
        // Assicura che il parametro sia del tipo corretto
        if (param instanceof ControlTemperature) {
            ControlTemperature temperature = (ControlTemperature) param;

            if (temperature.checkTemperature > 80) {
                System.out.println("The sensor is overheated!");
                return false;
            } else if (temperature.checkTemperature < 1) {
                System.out.println("The sensor may be broken!");
            }
        }

        // Passa al prossimo handler
        VerifySatellite next = getNext();
        if (next != null) {
            return next.check(param); // Continua la catena con il parametro corrente
        }
        return true;
    }
}
