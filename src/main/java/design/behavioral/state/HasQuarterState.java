package design.behavioral.state;

public class HasQuarterState implements State {
    private Machine machine;

    public HasQuarterState(final Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You already inserted a coin!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void pressButton() {
        System.out.println("You get drink!");
        machine.setState(machine.getNoQuarterState());
    }
}
