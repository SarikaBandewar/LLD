package lld2.strategy.rainwater;

import java.util.List;

public class MostOptimalCalculator implements WaterTrappedCalculator {
    private static MostOptimalCalculator instance;

    private MostOptimalCalculator() {
    }

    public static MostOptimalCalculator getInstance() {
        if (instance == null) instance = new MostOptimalCalculator();
        return instance;
    }

    @Override
    public int maxWater(List<Integer> ht) {
        return 0;
    }
}
