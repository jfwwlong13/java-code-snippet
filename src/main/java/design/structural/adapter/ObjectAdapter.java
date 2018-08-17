package design.structural.adapter;

public class ObjectAdapter implements Target {
    private final PowerPort220V powerPort220V;

    public ObjectAdapter(final PowerPort220V powerPort220V) {
        this.powerPort220V = powerPort220V;
    }

    @Override
    public void convert_110V() {
        System.out.println("Start to adapt 220v");
        powerPort220V.output220V();
    }
}
