package lld2.observer;

public class AnalyticSender implements OrderPlacedSubscriber, OrderCancelSubscriber {
    @Override
    public void onOrderCancelled() {
        System.out.println("Sending analytics as order has been cancelled");
    }

    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Sending analytics data as order been placed. ");
        return new ReturnData("Added to analytics data");
    }

    public AnalyticSender() {
        Amazon.getInstance().registerOrderPlacedSubscriber(this);
        Amazon.getInstance().registerOrderCancelSubscriber(this);
    }
}
