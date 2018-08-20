package design.structural.bridge;

public class App {
    public static void main(final String[] args) {
        OperatingSystem system = new Linux(new MkvPlayer());
        system.play();
        
        system = new Windows(new Mp3Player());
        system.play();
    }
}
