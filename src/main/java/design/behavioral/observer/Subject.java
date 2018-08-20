package design.behavioral.observer;

public interface Subject {
    void notifyObservers();

    void register(Observer observer);
}
