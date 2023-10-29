package lld2.decorator.icecreamExample;

public class ChocolateCone implements Icecream {
    Icecream ic;

    public ChocolateCone() {

    }

    public ChocolateCone(Icecream ic) {
        this.ic = ic;
    }

    @Override
    public String getDescription() {
        if (ic == null)
            return "Chocolate Cone";
        return ic.getDescription() + " + Chocolate Cone";
    }

    @Override
    public double getCost() {
        if (ic == null)
            return 50;
        return ic.getCost() + 50;
    }
}
