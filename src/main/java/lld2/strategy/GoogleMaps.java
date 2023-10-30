package lld2.strategy;

public class GoogleMaps {
    public static void main(String[] args) {
        String A = "Home", B = "Office";
        PathCalculator pathCalculator = PathCalculatorFactory.findPathCalculator(TransportationModes.SomethingElse);
        assert pathCalculator != null : "Path calculation can not be done.";
        if (pathCalculator != null)
            pathCalculator.findPath(A, B);
        else
            System.out.println("Path calculation can not be done.");
    }
}
