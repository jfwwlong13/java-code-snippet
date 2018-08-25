package design.structural.composite;

public interface File {
    String getName();

    void print();

    default void add(final File file) {
        throw new UnsupportedOperationException("Not supported");
    }
}
