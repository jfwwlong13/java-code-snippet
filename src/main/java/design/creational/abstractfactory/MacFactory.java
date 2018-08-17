package design.creational.abstractfactory;

public class MacFactory implements Factory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Mouse createMouse() {
        return new MacMouse();
    }
}
