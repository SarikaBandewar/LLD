package lld2.strategy.rainwater;

import java.util.List;

public class OptimalCalculator implements WaterTrappedCalculator {
    private static OptimalCalculator instance;

    private OptimalCalculator() {
    }

    public static OptimalCalculator getInstance() {
        if (instance == null) instance = new OptimalCalculator();
        return instance;
    }

    @Override
    public int maxWater(List<Integer> ht) {
        return 0;
    }
}
