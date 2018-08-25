package design.behavioral.command;

public class App {
    public static void main(final String[] args) {
        final Target target = new Transformer();
        final Owner owner = new Owner();
        System.out.println(target);
        final Command c1 = new CommandChangeSize(target, 2);
        owner.change(c1);
        System.out.println(target);
        final Command c2 = new CommandChangeSize(target, 3);
        owner.change(c2);
        System.out.println(target);

        final Command c3 = new CommandChangeColor(target, "red");
        owner.change(c3);
        System.out.println(target);

        owner.undo();
        System.out.println(target);
        owner.undo();
        System.out.println(target);
        owner.undo();
        System.out.println(target);

    }
}
