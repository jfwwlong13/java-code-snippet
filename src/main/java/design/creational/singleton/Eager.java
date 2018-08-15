package design.creational.singleton;

public class Eager {
    private static final Eager INSTANCE = new Eager();

    private Eager() {}

    public static Eager getInstance() {
        return INSTANCE;
    }
}
