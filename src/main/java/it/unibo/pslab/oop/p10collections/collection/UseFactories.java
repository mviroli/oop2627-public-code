package it.unibo.pslab.oop.p10collections.collection;

import java.util.*;

public class UseFactories {
	public static void main(String[] s) {
		// Static methods with variable arguments to create immutable Set and List

		final Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6);
		IO.println(set);

		final List<String> list = List.of("a", "b", "c", "a");
		IO.println(list);

		final Set<String> set2 = Set.copyOf(list);
		IO.println(set2);
	}
}
