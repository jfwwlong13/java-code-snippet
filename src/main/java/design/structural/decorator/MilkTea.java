package design.structural.decorator;

public class MilkTea implements Beverage {

    @Override
    public void flavor() {
        System.out.println("With coffee flavor");
    }

    @Override
    public int price() {
        return 500;
    }
}
