package it.unibo.pslab.oop.p09generics.abstractions;

public class ObjectPair {
	
	private final Object first;
	private final Object second;
	
	public ObjectPair(Object first, Object second){
		this.first = first;
		this.second = second;
	}

	public Object getFirst() {
		return first;
	}

	public Object getSecond() {
		return second;
	}

}
