package br.soujava.greeting;

import br.soujava.greeting.internal.NameSwapper;
import static br.soujava.util.Checker.check;

public class Greeter {

    public void greet(String fullName) {
        NameSwapper swapper = new NameSwapper();
        String swappedName = swapper.swap(fullName);
        if(check(swappedName)) {
            System.out.println("Hello " + swappedName);
        }
    }
 }
