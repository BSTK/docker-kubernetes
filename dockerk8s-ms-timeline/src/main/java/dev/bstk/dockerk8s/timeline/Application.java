package dev.bstk.dockerk8s.timeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("*******************************");
        LOGGER.info("***    MS-TIMELINE >> OK    ***");
        LOGGER.info("*******************************");
        SpringApplication.run(Application.class, args);
    }

}
