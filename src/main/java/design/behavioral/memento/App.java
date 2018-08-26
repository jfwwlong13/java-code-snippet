package design.behavioral.memento;

public class App {
    public static void main(final String[] args) {
        final Star star = new Star("2018-01-01");
        StarMemento starMemento = star.getStarMemento();
        star.timePass();
        System.out.println(star.getDate());
        star.setMemento(starMemento);
        System.out.println(star.getDate());
    }
}
