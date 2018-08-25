package design.behavioral.command;

public class Transformer implements Target {
    private int size;
    private String color;

    public Transformer() {
        size = 1;
        color = "white";
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void changeSize(int size) {
        this.size = size;
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }
}
