package design.creational.factory.method;

public class App {

    public static void main(final String[] args) {
        ComputerFactory factory = new AppleComputerFactory();
        Computer computer = factory.manufacture();
        computer.display();

        factory = new LenovoComputerFactory();
        computer = factory.manufacture();
        computer.display();
    }
}
