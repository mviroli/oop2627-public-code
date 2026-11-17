package it.unibo.pslab.oop.p17lambda.first;

public interface Filter<X> {
	
	boolean applyFilter(X x); // Does element x pass the filter?
}
