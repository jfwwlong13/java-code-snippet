package design.structural.bridge;

public class Windows implements OperatingSystem {
    private final Player player;

    public Windows(final Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Playing on Windows for");
        player.play();
    }
}
