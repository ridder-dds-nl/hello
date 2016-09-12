package hello.subscription;

import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

/**
 * Created by ralph on 11-9-16.
 */
public class SubscriptionRepository {

    @PersistenceContext(unitName = "hello")
    EntityManager entityManager;


    public Optional<Subscription> findByContainerNumber(final String containerNumber) {
        final QSubscription subscription = QSubscription.subscription;
        final JPAQuery<Subscription> query = new JPAQuery<>(entityManager);
        final Subscription result = query.select(subscription).from(subscription)//
                .where(subscription.containerNumber.eq(containerNumber)).fetchOne();
        return result == null ? Optional.empty() : Optional.of(result);
    }
}
