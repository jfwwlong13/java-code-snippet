package design.behavioral.templatemethod;

public class DradisRoiTargetBidding extends RoiTargetBidding {
    @Override
    double increase(double bid) {
        return bid + 2;
    }

    @Override
    double multiply(double bid) {
        return bid * 4;
    }
}
