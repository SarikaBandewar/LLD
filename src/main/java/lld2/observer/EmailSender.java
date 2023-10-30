package lld2.observer;

public class EmailSender implements OrderPlacedSubscriber {
    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Sending email for order placed");
        return new ReturnData("Email Sent");
    }

    public EmailSender() {
        Amazon.getInstance().registerOrderPlacedSubscriber(this);
    }
}
