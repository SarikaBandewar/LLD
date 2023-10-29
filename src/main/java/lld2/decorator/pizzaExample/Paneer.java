package lld2.decorator.pizzaExample;

public class Paneer implements Pizza {

    private Pizza pizza;

    public Paneer(Pizza pi) {
        this.pizza = pi;
    }

    @Override
    public String getName() {
        return "Paneer";
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 60;
    }
}
