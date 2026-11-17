package it.unibo.pslab.oop.p17lambda.switches;

// Assumiamo: enum WorkDay { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY }
public class SwitchStatement {

    public static boolean isAGoodDay(WorkDay workday){
        boolean result = false;
        switch (workday){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                result = false;
                break;
            case THURSDAY:
            case FRIDAY:
                result = true;
        }
        return result;
    }

    public static void printWelcomeMessage(WorkDay workday){
        switch (workday){
            case MONDAY: IO.println("Welcome from weekend!"); break;
            case FRIDAY: IO.println("Have a nice weekend!"); break;
            default: IO.println("Nothing to say");
        }
    }

    public static int fibonacci(int i){
        switch (i) {
            case 0: return 1;
            case 1: return 1;
            default: return fibonacci(i-1) + fibonacci(i-2);
        }
    }
}
