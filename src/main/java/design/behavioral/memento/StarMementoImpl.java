package design.behavioral.memento;

public class StarMementoImpl implements StarMemento {
    private final String date;

    public StarMementoImpl(String date) {
        this.date = date;
    }

    @Override
    public String getDate() {
        return date;
    }
}
