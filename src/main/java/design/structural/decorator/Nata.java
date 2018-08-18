package design.structural.decorator;

public class Nata implements Beverage {
    private final Beverage beverage;

    public Nata(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void flavor() {
        System.out.println("Nata flavor");
        beverage.flavor();
    }

    @Override
    public int price() {
        return 30 + beverage.price();
    }
}
