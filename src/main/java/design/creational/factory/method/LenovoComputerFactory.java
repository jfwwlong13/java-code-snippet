package design.creational.factory.method;

public class LenovoComputerFactory implements ComputerFactory {
    @Override
    public Computer manufacture() {
        return new LenovoComputer();
    }
}
