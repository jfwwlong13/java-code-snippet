package design.behavioral.visitor;

public class PrintVisitor implements Visitor {
    @Override
    public void visitWheel(Wheel wheel) {
        System.out.println(wheel.getName());
    }

    @Override
    public void visitEngine(Engine engine) {
        System.out.println(engine.getName());
    }
}
