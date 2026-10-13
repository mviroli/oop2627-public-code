package it.unibo.pslab.oop.p10collections.set;

import java.util.*;

public class UseHashSetPerson {
	public static void main(String[] s) {
		// HashSet is a detail, always work over Set if possible!
		final Set<Person> set = new HashSet<>();

		// Adding 4 elements
		set.add(new Person("Rossi", 1960, false));
		set.add(new Person("Bianchi", 1980, true));
		set.add(new Person("Verdi", 1972, false));
		set.add(new Person("Neri", 1968, false));
		IO.println(set);

		// Checking presence/absense of 2 elements
		final Person p1 = new Person("Rossi", 1960, false);
		final Person p2 = new Person("Rossi", 1961, false);
		IO.println("Check "+p1+" found "+set.contains(p1));
		IO.println("Check "+p2+" found "+set.contains(p2));

		// Iteration: note, out of order wrt order of addition
		for (final Person p : set) {
			IO.println("Iterating: "+p+" hash = "+p.hashCode());
		}
	}
}
