package it.unibo.pslab.oop.p10collections.set;

import java.util.Set;

public interface Archive {

	void add(String name, int birthYear, boolean married);
	
	void remove(String name, int birthYear);
	
	int size();
	
	Set<String> allMarried();
}
