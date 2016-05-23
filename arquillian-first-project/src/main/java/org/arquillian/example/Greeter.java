package org.arquillian.example;

import java.io.PrintStream;

/**
 * A component for creating personal greetings.
 */

//test

public class Greeter {
    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}