package design.behavioral.state;

public class NoQuarterState implements State {
    private final Machine machine;

    public NoQuarterState(final Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a coin");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a coin");
    }

    @Override
    public void pressButton() {
        System.out.println("You press, but no coin");
    }
}
