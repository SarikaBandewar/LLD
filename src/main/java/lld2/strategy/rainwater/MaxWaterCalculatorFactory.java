package lld2.strategy.rainwater;

public class MaxWaterCalculatorFactory {
    public static WaterTrappedCalculator getRequiredCalculator(String tc, String sc) {
        if (tc.equalsIgnoreCase("n2") && sc.equalsIgnoreCase("1"))
            return BruteForceCalculator.getInstance();
        else if (tc.equalsIgnoreCase("n") && sc.equalsIgnoreCase("n"))
            return OptimalCalculator.getInstance();
        else if (tc.equalsIgnoreCase("n") && sc.equalsIgnoreCase("1"))
            return MostOptimalCalculator.getInstance();
        else
            return null;
    }
}
