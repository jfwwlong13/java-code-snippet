package design.behavioral.observer;

public class CurrentWeather implements Observer {
    @Override
    public void update(int val) {
        System.out.println("update current temp to " + val);
    }
}
