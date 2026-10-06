package it.unibo.pslab.oop.p05encapsulation;

public class UseEuroAmount {

  public static void main() {
    EuroAmount amount1 = new EuroAmount(100, 0);
    EuroAmount amount2 = new EuroAmount(50, 70);
    EuroAmount amount3 = amount1.sum(amount2);
    EuroAmount amount4 = amount3.multiply(0.33);
    IO.println("String: " + amount1.asString() + ", Value: " + amount1.asDecimal());
    IO.println("String: " + amount2.asString() + ", Value: " + amount2.asDecimal());
    IO.println("String: " + amount3.asString() + ", Value: " + amount3.asDecimal());
    IO.println("String: " + amount4.asString() + ", Value: " + amount4.asDecimal());
  }
}
