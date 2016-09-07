package hello;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.logging.Logger;

/**
 * Created by ralph on 7-9-16.
 */
@Path("/message")
public class HelloResource {

    private static final Logger logger = Logger.getLogger(HelloResource.class.getName());

    public HelloResource() {
        logger.info("HelloResource constructed.");
    }

    @GET
    public String hello() {
        return "Hello";
    }
}
