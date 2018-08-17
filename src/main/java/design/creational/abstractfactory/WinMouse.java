package design.creational.abstractfactory;

public class WinMouse implements Mouse {
    @Override
    public void tap() {
        System.out.println("Win mouse tap");
    }
}
