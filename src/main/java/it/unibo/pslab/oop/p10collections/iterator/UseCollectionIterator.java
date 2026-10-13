package it.unibo.pslab.oop.p10collections.iterator;

import java.util.*;

public class UseCollectionIterator {

	public static void main(String[] s) {
		// Usiong LinkedList
		final LinkedList<Double> list = new LinkedList<>();
		// Inserting 50 elements
		for (int i = 0; i < 50; i++) {
			list.add(Math.random());
		}
		// Printing with a foreach
		int ct = 0;
		for (double d : list) {
			IO.println(ct++ + "\t" + d);
		}
		// 0 0.10230513602737423
		// 1 0.4318582138894327
		// 2 0.5239222319032795
		// ..
	}
}
