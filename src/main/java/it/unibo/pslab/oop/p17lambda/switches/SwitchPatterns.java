package it.unibo.pslab.oop.p17lambda.switches;

import java.util.Optional;
import java.util.function.*;

public class SwitchPatterns {

    record Person(String name, String surname, int year){}

    public static String asString(Object obj) {
        return switch (obj) {
            case null -> "null";
            case String str -> str;
            case Integer i when i>=0 -> "Positive: "+i;
            case Integer i -> "Negative: "+i;
            case Person(var n, var s, var y) -> "(" + n + "," + s + "," + y + ")";
            default -> obj.toString();
        };
    }

    public static void main(String[] args){
        IO.println(asString(null));
        IO.println(asString("ciao"));
        IO.println(asString(1));
        IO.println(asString(-1));
        IO.println(asString(new Person("mario", "rossi", 1900)));
        IO.println(true);
    }
}
