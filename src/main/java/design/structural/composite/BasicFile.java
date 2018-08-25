package design.structural.composite;

public class BasicFile implements File {
    private final String fileName;

    public BasicFile(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public void print() {
        System.out.print(fileName + ",");
    }
}
