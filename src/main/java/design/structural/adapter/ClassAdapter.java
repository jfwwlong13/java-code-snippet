package design.structural.adapter;

public class ClassAdapter extends PowerPort220V implements Target {

    @Override
    public void convert_110V() {
        System.out.println("Start to adapt 220v");
        super.output220V();
    }
}
