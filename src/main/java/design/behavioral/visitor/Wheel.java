package design.behavioral.visitor;

public class Wheel {
    private final String name;

    public Wheel(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visitWheel(this);
    }
}
