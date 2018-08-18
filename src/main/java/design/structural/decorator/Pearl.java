package design.structural.decorator;

public class Pearl implements Beverage {
    private final Beverage beverage;

    public Pearl(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void flavor() {
        System.out.println("Pearl smell");
        beverage.flavor();
    }

    @Override
    public int price() {
        return 50 + beverage.price();
    }
}
