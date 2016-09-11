package hello.subscription;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by ralph on 11-9-16.
 */
@Stateless
public class SubscriptionEjb {

    @PersistenceContext(unitName = "hello")
    EntityManager entityManager;

    public void test() {
        entityManager.find(Subscription.class, 1L);
    }
}
