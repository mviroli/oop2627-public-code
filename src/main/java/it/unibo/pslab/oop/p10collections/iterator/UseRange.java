package it.unibo.pslab.oop.p10collections.iterator;

public class UseRange {
	public static void main(String[] s) {
		for (final int i: new Range(5, 12)) {
			IO.println(i);
			// 5 6 7 8 9 10 11 12
		}
	}
}
