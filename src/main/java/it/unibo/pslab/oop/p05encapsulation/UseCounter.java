package it.unibo.pslab.oop.p05encapsulation;

public class UseCounter {
	
	public static void main() {
		final Counter c = new Counter();
		IO.println(c.getValue()); // 0
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		IO.println(c.getValue()); // 4
	}
}
