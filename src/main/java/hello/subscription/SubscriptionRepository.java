package hello.subscription;

import com.querydsl.jpa.impl.JPAQuery;

/**
 * Created by ralph on 11-9-16.
 */
public class SubscriptionRepository {

    public Subscription findByContainerNumber() {
        QSubscription subscription = QSubscription.subscription;
        JPAQuery<Subscription> query = new JPAQuery<>();
        return query.select(subscription).from(subscription)//
                .where(subscription.containerNumber.eq("X")).fetchOne();
    }
}
