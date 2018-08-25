package design.behavioral.command;

public class CommandChangeSize implements Command {
    private final Target target;
    private final int val;
    private int previousVal;

    public CommandChangeSize(Target target, int val) {
        this.target = target;
        this.val = val;
    }

    @Override
    public void execute() {
        previousVal = target.getSize();
        target.changeSize(val);
    }

    @Override
    public void undo() {
        if (previousVal != 0) {
            int temp = target.getSize();
            target.changeSize(previousVal);
            previousVal = temp;
        }
    }
}
