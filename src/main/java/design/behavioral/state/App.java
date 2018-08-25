package design.behavioral.state;

public class App {
    public static void main(final String[] args) {
        final Machine machine = new Machine();
        machine.ejectCoin();
        machine.pressButton();
        machine.insertCoin();
        machine.insertCoin();
        machine.ejectCoin();
        machine.pressButton();
        machine.insertCoin();
        machine.pressButton();
        machine.ejectCoin();
    }
}
