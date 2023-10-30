package lld2.strategy;

public class BikePathCalculator implements PathCalculator {
    private static BikePathCalculator instance;

    private BikePathCalculator() {
    }

    public static BikePathCalculator getInstance() {
        if (instance == null) instance = new BikePathCalculator();
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Find best path from " + source + " to " + destination + " by bike.");
    }
}
