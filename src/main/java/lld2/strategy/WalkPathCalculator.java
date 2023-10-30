package lld2.strategy;

public class WalkPathCalculator implements PathCalculator {
    private static WalkPathCalculator instance;

    private WalkPathCalculator() {
    }

    public static WalkPathCalculator getInstance() {
        if (instance == null) instance = new WalkPathCalculator();
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Find best path from " + source + " to " + destination + " by walk.");
    }
}
