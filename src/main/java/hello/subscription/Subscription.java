package hello.subscription;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ralph on 7-9-16.
 */
@Entity
@Table(name="subscription")
public class Subscription {

    @Column(name="container_number")
    private String containerNumber;

    @Column(name="full_empty")
    private String fullEmpty;

    @Column(name="load_discharge")
    private String loadDischarge;

    @Temporal(TemporalType.DATE)
    @Column(name="start_date")
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name="end_date")
    private Date endDate;

    @Column(name="customer")
    private String customer;

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public String getFullEmpty() {
        return fullEmpty;
    }

    public void setFullEmpty(String fullEmpty) {
        this.fullEmpty = fullEmpty;
    }

    public String getLoadDischarge() {
        return loadDischarge;
    }

    public void setLoadDischarge(String loadDischarge) {
        this.loadDischarge = loadDischarge;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
