package design.creational.abstractfactory;

public class App {

    public static void main(final String[] args) {
        Factory factory = new WinFactory();
        factory.createButton().click();
        factory.createMouse().tap();

        factory = new MacFactory();
        factory.createButton().click();
        factory.createMouse().tap();
    }
}
