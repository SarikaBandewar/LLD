package lld2.decorator.pizzaExample;

public class Pepperoni implements Pizza {
    @Override
    public String getName() {
        return "Pepperoni";
    }

    @Override
    public String getDescription() {
        return "Pepperoni";
    }

    @Override
    public int getCost() {
        return 180;
    }
}
