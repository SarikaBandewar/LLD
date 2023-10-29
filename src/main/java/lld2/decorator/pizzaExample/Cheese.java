package lld2.decorator.pizzaExample;

public class Cheese implements Pizza {
    private Pizza pizza;

    public Cheese(Pizza pi) {
        this.pizza = pi;
    }

    @Override
    public String getName() {
        return "Cheese";
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }
}
