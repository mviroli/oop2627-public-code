package it.unibo.pslab.oop.p07inheritance.pre;

public class UseCounter {
	public static void main(String[] s) {
		final Counter c = new Counter(0);

		IO.println(c.getValue()); // 0
		c.increment();
		c.increment();
		IO.println(c.getValue()); // 2
	}
}
