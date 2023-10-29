package lld2.decorator.pizzaExample;

public class Olive implements Pizza {
    private Pizza pizza;

    public Olive(Pizza pi) {
        this.pizza = pi;
    }

    @Override
    public String getName() {
        return "Olive";
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + Olive";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 20;
    }
}
