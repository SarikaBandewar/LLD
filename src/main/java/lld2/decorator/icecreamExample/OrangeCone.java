package lld2.decorator.icecreamExample;

public class OrangeCone implements Icecream {
    public OrangeCone() {
        
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }

    @Override
    public double getCost() {
        return 40;
    }
}
