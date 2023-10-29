package lld2.decorator.pizzaExample;

public class Margherita implements Pizza {
    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
