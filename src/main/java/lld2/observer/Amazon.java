package lld2.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();
    List<OrderCancelSubscriber> orderCancelSubscribers = new ArrayList<>();

    private static Amazon instance;

    private Amazon() {

    }

    public static Amazon getInstance() {
        if (instance == null)
            instance = new Amazon();
        return instance;
    }


    void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    void registerOrderCancelSubscriber(OrderCancelSubscriber orderCancelSubscriber) {
        orderCancelSubscribers.add(orderCancelSubscriber);
    }

    void deRegisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    void deRegisterOrderCancelSubscriber(OrderCancelSubscriber orderCancelSubscriber) {
        orderCancelSubscribers.remove(orderCancelSubscriber);
    }

    public void orderPlaced() {
        orderPlacedSubscribers.stream().map(OrderPlacedSubscriber::onOrderPlaced).forEach(System.out::println);
    }

    public void orderCancelled() {
        orderCancelSubscribers.forEach(OrderCancelSubscriber::onOrderCancelled);
    }
}


