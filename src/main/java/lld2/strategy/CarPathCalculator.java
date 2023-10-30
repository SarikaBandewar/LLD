package lld2.strategy;

public class CarPathCalculator implements PathCalculator {

    private static CarPathCalculator instance;

    private CarPathCalculator() {
    }

    public static CarPathCalculator getInstance() {
        if (instance == null) instance = new CarPathCalculator();
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Find best path from " + source + " to " + destination + " by car.");
    }
}
