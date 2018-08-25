package design.behavioral.command;

import java.util.Stack;

public class Owner {
    private Stack<Command> commands = new Stack<>();

    public void change(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        Command pop = commands.pop();
        pop.undo();
    }
}
