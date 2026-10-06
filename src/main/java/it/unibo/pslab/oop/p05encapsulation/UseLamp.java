package it.unibo.pslab.oop.p05encapsulation;

public class UseLamp {
   private static void test1() {
      final Lamp l = new Lamp();
      l.switchOn();
      l.setIntensity(0.5);
      l.dim();
      l.dim();
      IO.println(l);
      l.brighten();
      IO.println(l);
      // Powered on: true Intensity: 0.4
   }

   public static void main(final String[] s) {
      UseLamp.test1();
      // other tests...
   }
}
