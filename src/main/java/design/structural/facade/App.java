package design.structural.facade;

public class App {

    public static void main(final String[] args) {
        final Computer computer = new Computer();
        computer.startComputer();
        System.out.println("I'm playing games");
        computer.closeComputer();
    }
}
