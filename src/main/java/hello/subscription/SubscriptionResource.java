package hello.subscription;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import static hello.subscription.SubscriptionRequest.F;
import static hello.subscription.SubscriptionRequest.L;

/**
 * Created by ralph on 7-9-16.
 */
@Path("/subscriptions")
public class SubscriptionResource {

    @GET
    public SubscriptionRequest getSubscriptions() {
        SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
        subscriptionRequest.setContainerNumber("ABCD0000001");
        subscriptionRequest.setFullEmpty(F);
        subscriptionRequest.setLoadDischarge(L);
        return subscriptionRequest;
    }
}
