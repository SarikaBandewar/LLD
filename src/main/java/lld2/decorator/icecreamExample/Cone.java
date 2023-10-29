package lld2.decorator.icecreamExample;

public class Cone implements Icecream {
    Icecream ic;

    public Cone(Icecream ic) {
        this.ic = ic;
    }

    public Cone() {
        
    }

    @Override
    public String getDescription() {
        if (ic == null) {
            return "Plain Cone";
        }
        return this.ic.getDescription() + " + Plain Cone";
    }

    @Override
    public double getCost() {
        if (ic == null)
            return 30;

        return ic.getCost() + 30;
    }
}
