package design.behavioral.visitor;

public class Car {
    private final Engine engine;
    private final Wheel wheel;

    public Car() {
        this.engine = new Engine("engine");
        this.wheel = new Wheel("wheel");
    }

    public void accept(Visitor visitor) {
        engine.accept(visitor);
        wheel.accept(visitor);
    }
}
