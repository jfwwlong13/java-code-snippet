package design.behavioral.memento;

public class Star {
    private String date;

    public Star(String date) {
        this.date = date;
    }

    public StarMemento getStarMemento() {
        return new StarMementoImpl(date);
    }

    public void timePass() {
        date = "2019-01-01";
    }

    public void setMemento(final StarMemento memento) {
        this.date = memento.getDate();
    }

    public String getDate() {
        return date;
    }
}
