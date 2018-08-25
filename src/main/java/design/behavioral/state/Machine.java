package design.behavioral.state;

public class Machine {
    private final State noQuarterState = new NoQuarterState(this);
    private final State hasQuarterState = new HasQuarterState(this);

    private State currentState;

    public Machine() {
        currentState = noQuarterState;
    }

    public void insertCoin() {
        currentState.insertQuarter();
    }

    public void ejectCoin() {
        currentState.ejectQuarter();
    }

    public void pressButton() {
        currentState.pressButton();
    }

    public void setState(final State state) {
        currentState = state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
}
