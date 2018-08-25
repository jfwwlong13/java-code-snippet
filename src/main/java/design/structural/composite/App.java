package design.structural.composite;

public class App {
    public static void main(final String[] args) {
        final File file = new Directory("root");
        file.add(new BasicFile("file_1"));
        file.add(new BasicFile("file_2"));
        final File dir = new Directory("var");
        dir.add(new BasicFile("file_3"));
        dir.add(new BasicFile("file_4"));
        file.add(dir);
        file.add(new BasicFile("file_5"));

        file.print();
    }
}
