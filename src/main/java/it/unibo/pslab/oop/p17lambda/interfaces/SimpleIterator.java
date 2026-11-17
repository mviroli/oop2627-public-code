package it.unibo.pslab.oop.p17lambda.interfaces;

import java.util.*;

public interface SimpleIterator<X> {

	X getNext();
	
	// a template method: i.e., it calls abstract getNext()
	default List<X> getListOfNext(int n){
		final List<X> l = new LinkedList<>();
		for (int i = 0; i < n; i++){
			l.add(getNext());
		}
		return l;
	}
	
}
