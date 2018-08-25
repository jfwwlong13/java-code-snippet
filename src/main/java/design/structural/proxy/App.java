package design.structural.proxy;

public class App {
    public static void main(final String[] args) {
        final Algorithm algorithm = new AlgorithmProxy(new AlgorithmImpl());
        algorithm.calculate();
    }
}
