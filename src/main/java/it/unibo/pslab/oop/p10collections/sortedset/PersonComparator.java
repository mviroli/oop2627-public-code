package it.unibo.pslab.oop.p10collections.sortedset;

import java.util.Comparator;

/* Implementa la politica di confronto esternamente a Persona */

public class PersonComparator implements Comparator<Person> {

	// Confronto prima sul nome, poi sull'anno
	public int compare(Person o1, Person o2) {
		return o1.getName().equals(o2.getName()) 
				? o1.getYear() - o2.getYear() // Integer.compare(o1.getYear(), o2.getYear())
				: o1.getName().compareTo(o2.getName());
	}
}