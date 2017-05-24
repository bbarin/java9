package br.soujava.core;

import br.soujava.greeting.Greeter;

public class Main {
    public static void main(String... args) {
        String name = "SouJava Campinas!";
        Greeter greeter = new Greeter();
        greeter.greet(name);
    }
}