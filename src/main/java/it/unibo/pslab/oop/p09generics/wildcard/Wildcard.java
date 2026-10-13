package it.unibo.pslab.oop.p09generics.wildcard;

import it.unibo.pslab.oop.p09generics.iterators.*;

public class Wildcard {

	// Method using a wildcard
	public static void printAll(Iterator<?> it) {
		while (it.hasNext()) {
			IO.println(it.next());
		}
	}

	// Version with generic method
	public static <T> void printAll2(Iterator<T> it) {
		while (it.hasNext()) {
			IO.println(it.next());
		}
	}

	// Which one better?
	public static void main(String[] s) {
		Wildcard.printAll(new IntRangeIterator(1, 5));
		Wildcard.printAll2(new IntRangeIterator(1, 5));
		Wildcard.<Integer>printAll2(new IntRangeIterator(1, 5));
	}
}
