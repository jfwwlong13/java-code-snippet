package design.behavioral.observer;

public class App {
    public static void main(final String[] args) {
        final Subject subject = new WeatherData();
        subject.register(new CurrentWeather());
        subject.register(new ForcastWeather());
        subject.notifyObservers();
        subject.notifyObservers();
    }
}
