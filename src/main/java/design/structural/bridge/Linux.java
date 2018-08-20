package design.structural.bridge;

public class Linux implements OperatingSystem {
    private final Player player;

    public Linux(final Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Playing on Linux for");
        player.play();
    }
}
