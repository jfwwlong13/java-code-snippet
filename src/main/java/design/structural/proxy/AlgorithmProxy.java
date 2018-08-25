package design.structural.proxy;

public class AlgorithmProxy implements Algorithm {
    private final Algorithm algorithm;

    public AlgorithmProxy(final Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void calculate() {
        System.out.println("Before calculating");
        algorithm.calculate();
        System.out.println("Finish calculating");
    }
}
