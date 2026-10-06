package it.unibo.pslab.oop.p05encapsulation;

public class UseCounter2 {

  /* Conto su un array, con Contatore creato internamente */
  static int countElements(int[] array, int elem) {
    final Counter c = new Counter();
    for (final int i : array) { // schema "for-each"
      if (i == elem) {
        c.increment();
      }
    }
    return c.getValue();
  }
}
