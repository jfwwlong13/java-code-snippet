package design.creational.factory.method;

public class App {

    public static void main(final String[] args) {
        design.creational.factory.method.ComputerFactory factory = new design.creational.factory.method.AppleComputerFactory();
        design.creational.factory.method.Computer computer = factory.manufacture();
        computer.display();

        factory = new design.creational.factory.method.LenovoComputerFactory();
        computer = factory.manufacture();
        computer.display();
    }
}
