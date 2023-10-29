package lld2.decorator.pizzaExample;

public class Farmhouse implements Pizza {

    @Override
    public String getName() {
        return "Farmhouse";
    }

    @Override
    public String getDescription() {
        return "Farmhouse";
    }

    @Override
    public int getCost() {
        return 150;
    }
}
