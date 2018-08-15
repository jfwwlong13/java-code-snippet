package design.behavioral.strategy;

public class Chef {
    private CookStrategy cookStrategy;

    public Chef(final CookStrategy cookStrategy) {
        this.cookStrategy = cookStrategy;
    }

    public void setCookStrategy(final CookStrategy cookStrategy) {
        this.cookStrategy = cookStrategy;
    }

    public void cook() {
        cookStrategy.cook();
    }
}
