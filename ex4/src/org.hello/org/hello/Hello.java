package org.hello;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello {

    private static Logger logger = Logger.getLogger(Hello.class.getName());

    public static String greet(String who) {
        logger.info("Saying hello to " + who);
        return String.format("Hello, %s!", who);
    }

    public static Logger getLogger() {
        return logger;
    }

}
