package it.unibo.pslab.oop.p05encapsulation;

public class ImmutableEuroAmount {

  private final int cents;

  public ImmutableEuroAmount(int euros, int cents) {
    this.cents = euros * 100 + cents;
  }

  public double asDecimal() {
    return this.cents / 100.0;
  }

  public ImmutableEuroAmount sum(ImmutableEuroAmount amount) {
    return new ImmutableEuroAmount(0, this.cents + amount.cents);
  }

  public ImmutableEuroAmount multiply(double factor) {
    return new ImmutableEuroAmount(0, (int) (this.cents * factor));
  }

  public String asString() {
    return "%d.%02d\u20AC".formatted(this.cents / 100, this.cents % 100);
  }
}
