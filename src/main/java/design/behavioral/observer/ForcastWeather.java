package design.behavioral.observer;

public class ForcastWeather implements Observer {
    @Override
    public void update(int val) {
        System.out.println("Update forcast weather to " + val);
    }
}
