package org.hello.client;

import java.lang.reflect.Method;

import org.hello.Hello;

public class Main {

    public static void main(String[] args) throws Exception {
        Method method = Hello.class.getDeclaredMethod("greet", String.class);
        method.setAccessible(true);
        String s = (String) method.invoke(null, "World");
        System.out.println(s);
    }

}
