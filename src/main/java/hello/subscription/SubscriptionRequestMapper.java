package hello.subscription;

import java.util.Date;

/**
 * Created by ralph on 7-9-16.
 */
public class SubscriptionRequestMapper {

    public Subscription map(SubscriptionRequest subscriptionRequest) {
        Subscription subscription = new Subscription();
        subscription.setContainerNumber(subscriptionRequest.getContainerNumber());
        subscription.setLoadDischarge(subscriptionRequest.getLoadDischarge());
        subscription.setFullEmpty(subscriptionRequest.getFullEmpty());
        subscription.setStartDate(new Date());
        return subscription;
    }
}
