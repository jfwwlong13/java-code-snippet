package design.behavioral.command;

public class CommandChangeColor implements Command {
    private final Target target;
    private final String val;
    private String previousVal;

    public CommandChangeColor(Target target, String val) {
        this.target = target;
        this.val = val;
    }

    @Override
    public void execute() {
        previousVal = target.getColor();
        target.changeColor(val);
    }

    @Override
    public void undo() {
        if (previousVal != null) {
            String temp = target.getColor();
            target.changeColor(previousVal);
            previousVal = temp;
        }
    }
}
