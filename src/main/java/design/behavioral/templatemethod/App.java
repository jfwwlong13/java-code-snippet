package design.behavioral.templatemethod;

public class App {
    public static void main(final String[] args) {
        RoiTargetBidding roiTargetBidding = new JobseekerRoiTargetBidding();
        System.out.println(roiTargetBidding.calculateBid(2.0));

        roiTargetBidding = new DradisRoiTargetBidding();
        System.out.println(roiTargetBidding.calculateBid(2.0));
    }
}
