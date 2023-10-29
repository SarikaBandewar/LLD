package lld2.decorator.pizzaExample;

public class Tomato implements Pizza {
    private Pizza pizza;

    public Tomato(Pizza pi) {
        this.pizza = pi;
    }

    @Override
    public String getName() {
        return "Tomato";
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Tomato";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
}
