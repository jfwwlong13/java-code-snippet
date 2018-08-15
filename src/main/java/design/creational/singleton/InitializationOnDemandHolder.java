package design.creational.singleton;

public class InitializationOnDemandHolder {

    private InitializationOnDemandHolder() {
        if (HelperHolder.INSTANCE != null) {
            throw new InstantiationError("Not allowed");
        }
    }

    public static InitializationOnDemandHolder getInstance() {
        return HelperHolder.INSTANCE;
    }

    private static class HelperHolder {
        private static final InitializationOnDemandHolder INSTANCE = new InitializationOnDemandHolder();
    }
}
