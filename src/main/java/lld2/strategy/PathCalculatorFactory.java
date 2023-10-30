package lld2.strategy;

public class PathCalculatorFactory {
    public static PathCalculator findPathCalculator(TransportationModes mode) {
        PathCalculator pathCalculator = null;
        switch (mode) {
            case Bike:
                pathCalculator = BikePathCalculator.getInstance();
                break;

            case Car:
                pathCalculator = CarPathCalculator.getInstance();
                break;

            case Walk:
                pathCalculator = WalkPathCalculator.getInstance();
                break;
        }
        return pathCalculator;
    }

}
