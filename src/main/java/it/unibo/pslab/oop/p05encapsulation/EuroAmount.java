package it.unibo.pslab.oop.p05encapsulation;

public class EuroAmount {

  private int cents;

  public EuroAmount(int euros, int cents) {
    this.cents = euros * 100 + cents;
  }

  public double asDecimal() {
    return this.cents / 100.0;
  }

  public EuroAmount sum(EuroAmount amount) {
    return new EuroAmount(0, this.cents + amount.cents);
  }

  public EuroAmount multiply(double factor) {
    return new EuroAmount(0, (int) (this.cents * factor));
  }

  public String asString() {
    return "%d.%02d\u20AC".formatted(this.cents / 100, this.cents % 100);
  }
}
