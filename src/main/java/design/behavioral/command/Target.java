package design.behavioral.command;

public interface Target {
    void changeSize(int size);

    void changeColor(String color);

    String getColor();

    int getSize();
}
