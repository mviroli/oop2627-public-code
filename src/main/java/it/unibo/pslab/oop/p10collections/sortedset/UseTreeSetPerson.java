package it.unibo.pslab.oop.p10collections.sortedset;

import java.util.*;

public class UseTreeSetPerson {
	public static void main(String[] s) {

		final List<Integer> l = List.of(10, 20, 30, 40);
		final NavigableSet<Person> set = new TreeSet<>();
		set.add(new Person("Rossi", 1960, false));
		set.add(new Person("Bianchi", 1980, true));
		set.add(new Person("Verdi", 1972, false));
		set.add(new Person("Neri", 1972, false));
		set.add(new Person("Neri", 1968, false));

		for (final Person p : set) {
			IO.println("Iterating: " + p + " hash = " + p.hashCode());
		}
		for (final Person p : set.descendingSet()) {
			IO.println("Opposite iteration: " + p);
		}
		final Person limit = new Person("", 1970, false);
		for (final Person p : set.headSet(limit, false)) {
			IO.println("Iterating to 1970: " + p);
		}
	}
}
