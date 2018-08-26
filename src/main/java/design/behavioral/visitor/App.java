package design.behavioral.visitor;

public class App {
    public static void main(final String[] args) {
        final Car car = new Car();
        car.accept(new PrintVisitor());
    }
}
