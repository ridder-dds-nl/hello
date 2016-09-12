package hello.subscription;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

/**
 * Created by ralph on 11-9-16.
 */
@Stateless
public class SubscriptionEjb {

    @PersistenceContext(unitName = "hello")
    EntityManager entityManager;

    @Inject
    SubscriptionRepository subscriptionRepository;

    public void test() {
        Optional<Subscription> subscription = subscriptionRepository.findByContainerNumber("");
    }
}
