package design.behavioral.templatemethod;

public class JobseekerRoiTargetBidding extends RoiTargetBidding {
    @Override
    double increase(double bid) {
        return bid + 1;
    }

    @Override
    double multiply(double bid) {
        return bid * 2;
    }
}
