package it.unibo.pslab.oop.p09generics.iterators;

public interface Iterator<E> {

	// returns the next element, changing state
	E next();

	// are there other elements?
	boolean hasNext();

	/*
	 * Note: we do not know what happens if one calls
	 * next() after hasNext() gave false
	 */
}
