package lld2.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {
    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Generating invoice for order placed");
        return new ReturnData("Generating invoice");
    }

    public InvoiceGenerator() {
        Amazon.getInstance().registerOrderPlacedSubscriber(this);
    }
}
