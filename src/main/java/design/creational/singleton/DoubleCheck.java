package design.creational.singleton;

public class DoubleCheck {
    private static volatile DoubleCheck INSTANCE;

    private DoubleCheck() {}

    public static DoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheck();
                }
            }
        }

        return INSTANCE;
    }
}
