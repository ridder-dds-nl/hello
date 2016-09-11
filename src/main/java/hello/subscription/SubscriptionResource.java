package hello.subscription;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import static hello.subscription.SubscriptionRequest.F;
import static hello.subscription.SubscriptionRequest.L;

/**
 * @see hello.ApplicationConfig
 */
@Path("/subscriptions")
public class SubscriptionResource {

    @EJB
    SubscriptionEjb subscriptionEjb;

    @GET
    public SubscriptionRequest getSubscriptions() {
        subscriptionEjb.test();
        SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
        subscriptionRequest.setContainerNumber("ABCD0000001");
        subscriptionRequest.setFullEmpty(F);
        subscriptionRequest.setLoadDischarge(L);
        return subscriptionRequest;
    }
}
