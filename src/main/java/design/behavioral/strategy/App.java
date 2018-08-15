package design.behavioral.strategy;

public class App {

    public static void main(final String[] args) {
        final Chef chef = new Chef(new FryStrategy());
        chef.cook();
        chef.setCookStrategy(new RoastStrategy());
        chef.cook();
        chef.setCookStrategy(() -> System.out.println("I'm stewing!"));
        chef.cook();
    }
}
