package lld2.decorator.pizzaExample;

public class BBQChicken implements Pizza {
    @Override
    public String getName() {
        return "BBQChicken";
    }

    @Override
    public String getDescription() {
        return "BBQChicken";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
