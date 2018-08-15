package design.behavioral.strategy;

public class RoastStrategy implements CookStrategy {
    @Override
    public void cook() {
        System.out.println("I'm roasting!");
    }
}
