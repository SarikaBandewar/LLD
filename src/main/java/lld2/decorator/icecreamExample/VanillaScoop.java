package lld2.decorator.icecreamExample;

public class VanillaScoop implements Icecream {
    Icecream ic;

    public VanillaScoop(Icecream ic) {
        this.ic = ic;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + " + Vanilla Scoop";
    }

    @Override
    public double getCost() {
        return ic.getCost() + 30;
    }
}
