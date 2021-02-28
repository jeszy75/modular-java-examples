package org.hello;

import java.sql.Date;

public class Hello {

    public static String greet(String who) {
        return String.format("Hello, %s!", who);
    }

    public static Date now() {
        return new Date(System.currentTimeMillis());
    }

}
