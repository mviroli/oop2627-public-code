package it.unibo.pslab.oop.p07inheritance.pre;

public class UseMultiCounter {
    public static void main(String[] s) {
        final MultiCounter mc = new MultiCounter(10);
        IO.println(mc.getValue()); // 10
        mc.increment();
        mc.increment();
        IO.println(mc.getValue()); // 12
        mc.multiIncrement(10);
        IO.println(mc.getValue()); // 22
    }
}
