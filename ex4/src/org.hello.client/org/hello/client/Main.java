package org.hello.client;

import org.hello.Hello;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println(Hello.greet("World"));
        Logger logger = Hello.getLogger();
        System.out.println(logger);
    }
}
