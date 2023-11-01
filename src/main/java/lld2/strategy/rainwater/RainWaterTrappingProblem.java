package lld2.strategy.rainwater;

import java.util.List;

public class RainWaterTrappingProblem {
    int solve(List<Integer> hts, String tc, String sc) {
        WaterTrappedCalculator waterTrappedCalculator = MaxWaterCalculatorFactory.getRequiredCalculator(tc, sc);
        if (waterTrappedCalculator == null) {
            throw new RuntimeException("Sorry can not find max water trapped for given TC and SC");
        }
        return waterTrappedCalculator.maxWater(hts);
    }
}
