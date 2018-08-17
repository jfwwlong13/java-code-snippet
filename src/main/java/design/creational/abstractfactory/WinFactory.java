package design.creational.abstractfactory;

public class WinFactory implements Factory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Mouse createMouse() {
        return new WinMouse();
    }
}
