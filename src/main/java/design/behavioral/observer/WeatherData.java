package design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int val = 3;

    public void register(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        val++;
        observers.forEach(observer -> {
            observer.update(val);
        });
    }
}
