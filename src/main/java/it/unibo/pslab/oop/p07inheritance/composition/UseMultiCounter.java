package it.unibo.pslab.oop.p07inheritance.composition;

public class UseMultiCounter {
    public static void main(String[] s) {
        final MultiCounterImpl mc = new MultiCounterImpl(10);
        final Counter c = mc;
        IO.println(c.getValue()); // 10
        c.increment();
        c.increment();
        IO.println(c.getValue()); // 12
        mc.multiIncrement(10);
        IO.println(c.getValue()); // 22
    }
}
