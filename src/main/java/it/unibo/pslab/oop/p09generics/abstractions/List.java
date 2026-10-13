package it.unibo.pslab.oop.p09generics.abstractions;

/* Immutable linked list of objects */
public class List<X> {

	private final X head;
	private final List<X> tail;

	public List(final X head, final List<X> tail) {
		this.head = head;
		this.tail = tail;
	}

	public X getHead() {
		return this.head;
	}

	public List<X> getTail() {
		return this.tail;
	}

	public int getLength() {
		return (this.tail == null) ? 1 : 1 + this.tail.getLength();
	}

	public String toString() {
		return "|" + this.head
				+ ((this.tail == null) ? "|" : this.tail.toString());
	}
}
