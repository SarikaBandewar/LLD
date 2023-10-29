package lld2.decorator.icecreamExample;

public class Client {
    public static void main(String[] args) {
        Icecream i = new ChocoChipScoop(
                new VanillaScoop(
                        new ChocoChipScoop(
                                new Cone(
                                        new ChocolateCone(
                                                new Cone()
                                        )
                                )
                        )
                )
        );

        System.out.println(i.getDescription());
        System.out.println(i.getCost());
    }
}
