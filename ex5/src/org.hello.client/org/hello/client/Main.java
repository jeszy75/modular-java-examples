package org.hello.client;

import org.hello.Hello;

public class Main {
    public static void main(String[] args) {
        System.out.println(Hello.greet("World"));
        System.out.println(Hello.now().toLocalDate());
    }
}
