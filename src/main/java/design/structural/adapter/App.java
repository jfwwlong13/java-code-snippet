package design.structural.adapter;

public class App {
    public static void main(final String[] args) {
        Target target = new ClassAdapter();
        target.convert_110V();

        target = new ObjectAdapter(new PowerPort220V());
        target.convert_110V();
    }
}
