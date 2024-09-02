package statusCheck;

public abstract class VerifySatellite {
    private VerifySatellite next;

    public void setNext(VerifySatellite next) {
        this.next = next;
    }

    protected VerifySatellite getNext() {
        return next;
    }

    public abstract boolean check(Object param);
}