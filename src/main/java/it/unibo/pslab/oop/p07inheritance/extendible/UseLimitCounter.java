package it.unibo.pslab.oop.p07inheritance.extendible;

public class UseLimitCounter {
	public static void main(String[] s) {
		final LimitCounter c = new LimitCounter(5);
		IO.println(c.getValue()); // 0
		IO.println(c.isOver()); // false
		c.increment();
		c.increment();
		IO.println(c.getValue()); // 2
		IO.println(c.isOver()); // false
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		IO.println(c.getValue()); // 5
		IO.println(c.isOver()); // true
	}
}
