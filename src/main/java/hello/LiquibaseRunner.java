package hello;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Logger;

/**
 * Created by ralph on 11-9-16.
 */
@Singleton
@Startup
public class LiquibaseRunner {

    private static final Logger logger = Logger.getLogger(LiquibaseRunner.class.getName());

    @PostConstruct
    public void liquibaseUpdate() {
        logger.info("Starting liquibase update.");
    }
}
