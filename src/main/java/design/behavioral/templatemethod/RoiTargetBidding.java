package design.behavioral.templatemethod;

public abstract class RoiTargetBidding {
    public final double calculateBid(double bid) {
        bid = increase(bid);
        bid = multiply(bid);
        return bid;
    }

    abstract double increase(double bid);

    abstract double multiply(double bid);
}
