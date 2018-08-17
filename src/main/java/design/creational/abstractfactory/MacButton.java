package design.creational.abstractfactory;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button click");
    }
}
