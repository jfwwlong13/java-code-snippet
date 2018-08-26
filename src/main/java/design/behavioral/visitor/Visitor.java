package design.behavioral.visitor;

public interface Visitor {
    void visitWheel(Wheel wheel);

    void visitEngine(Engine engine);
}
