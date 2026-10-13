package it.unibo.pslab.oop.p10collections.set;

import java.util.*;

public class ArchiveImpl implements Archive {

	private final Set<Person> set = new HashSet<>();
	
	public void add(String name, int birthYear, boolean married) {
		this.set.add(new Person(name, birthYear, married));
	}

	public void remove(String name, int birthYear) {
		this.set.remove(new Person(name, birthYear,false));
	}

	public int size() {
		return this.set.size();
	}

	public Set<String> allMarried() {
		final Set<String> newset = new HashSet<>();
		for (final Person p: this.set) {
			if (p.isMarried()) {
				newset.add(p.getName());
			}
		}
		return newset;
	}
}
