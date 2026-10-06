package it.unibo.pslab.oop.p07inheritance.extendible;

public class UseBiCounter {
	public static void main(String[] s) {
		final BiCounter c = new BiCounter(0);
		IO.println(c.getValue()); // 0
		c.increment();
		c.increment();
		IO.println(c.getValue()); // 2
		c.decrement();
		IO.println(c.getValue()); // 1
	}
}
