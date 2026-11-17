package it.unibo.pslab.oop.p17lambda.switches;

import java.util.Optional;
import java.util.function.*;

public class SwitchExpression {

    public static boolean isAGoodDay(WorkDay workday) {
        return switch (workday) {
            case MONDAY, TUESDAY, WEDNESDAY -> false;
            case THURSDAY, FRIDAY -> true;
        };
    }

    public static void printWelcomeMessage(WorkDay workday){
        IO.println(switch (workday){ // Applico DRY, con lo switch "interno"
            case MONDAY -> "Welcome from weekend!";
            case FRIDAY -> "Have a nice weekend!"; 
            default -> "Nothing to say";
        });
    }

    public static int fibonacci(int i) {
        return switch (i) {
            case 0, 1 -> 1;
            default -> fibonacci(i - 1) + fibonacci(i - 2);
        };
    }

    public static void main(String[] args){
        Function<Integer, Optional<Integer>> sqrt = i -> switch(i){
            case 1 -> Optional.of(1);
            case 4 -> Optional.of(2);
            case 9 -> Optional.of(3);
            default -> Optional.empty();
        };
        IO.println(sqrt.apply(5));
    }
}
