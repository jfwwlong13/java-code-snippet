package design.behavioral.visitor;

public class Engine {
    private final String name;

    public Engine(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visitEngine(this);
    }
}
