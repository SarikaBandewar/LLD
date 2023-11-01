package lld2.strategy.rainwater;

import java.util.List;

public class BruteForceCalculator implements WaterTrappedCalculator {
    private static BruteForceCalculator instance;

    private BruteForceCalculator() {
    }

    public static BruteForceCalculator getInstance() {
        if (instance == null) instance = new BruteForceCalculator();
        return instance;
    }

    @Override
    public int maxWater(List<Integer> ht) {
        return 0;
    }
}
