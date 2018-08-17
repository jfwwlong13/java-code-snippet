package design.creational.abstractfactory;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Win button click");
    }
}
