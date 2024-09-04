package statusCheck;

public class ControlTemperature extends VerifySatellite {
    private int checkTemperature;

    public ControlTemperature(int checkTemperature) {
        this.checkTemperature = checkTemperature;
    }

    @Override
    public boolean check(Object param) {
        if (param instanceof ControlTemperature) {
            ControlTemperature temperature = (ControlTemperature) param;

            if (temperature.checkTemperature > 80) {
                System.out.println("The sensor is overheated!");
                return false;
            } else if (temperature.checkTemperature < 1) {
                System.out.println("The sensor may be broken!");
            }
        }

        VerifySatellite next = getNext();
        if (next != null) {
            return next.check(param);
        }
        return true;
    }
}
