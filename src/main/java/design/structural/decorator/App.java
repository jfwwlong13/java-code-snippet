package design.structural.decorator;

public class App {
    public static void main(final String[] args) {
        final Beverage beverage = new Nata(new Pearl(new Pearl(new MilkTea())));
        beverage.flavor();
        System.out.println(beverage.price());
    }
}
