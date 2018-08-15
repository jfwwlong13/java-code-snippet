package design.behavioral.strategy;

public class FryStrategy implements CookStrategy {
    @Override
    public void cook() {
        System.out.println("I'm frying!");
    }
}
