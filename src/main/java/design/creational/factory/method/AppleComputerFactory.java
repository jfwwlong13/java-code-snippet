package design.creational.factory.method;

public class AppleComputerFactory implements ComputerFactory {
    @Override
    public Computer manufacture() {
        return new AppleComputer();
    }
}
