package jmockit;

public class Clothes {
    private final String coat;
    private final String shoes;

    public Clothes(String coat, String shoes) {
        this.coat = coat;
        this.shoes = shoes;
    }

    public String getCoat() {
        return coat;
    }

    public String getShoes() {
        return shoes;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "coat='" + coat + '\'' +
                ", shoes='" + shoes + '\'' +
                '}';
    }
}
