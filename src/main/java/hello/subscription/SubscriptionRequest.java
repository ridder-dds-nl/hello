package hello.subscription;

/**
 * Created by ralph on 7-9-16.
 */
public class SubscriptionRequest {

    public static final String F = "F";

    public static final String L = "L";

    private String containerNumber;

    private String loadDischarge;

    private String fullEmpty;

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public String getLoadDischarge() {
        return loadDischarge;
    }

    public void setLoadDischarge(String loadDischarge) {
        this.loadDischarge = loadDischarge;
    }

    public String getFullEmpty() {
        return fullEmpty;
    }

    public void setFullEmpty(String fullEmpty) {
        this.fullEmpty = fullEmpty;
    }
}
