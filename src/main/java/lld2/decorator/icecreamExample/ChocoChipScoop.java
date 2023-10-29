package lld2.decorator.icecreamExample;

public class ChocoChipScoop implements Icecream {
    private Icecream ic;

    public ChocoChipScoop(Icecream ic) {
        this.ic = ic;
    }

    @Override
    public String getDescription() {
        return ic.getDescription() + " + ChocoChip Scoop";
    }

    @Override
    public double getCost() {
        return ic.getCost() + 40;
    }
}
