package it.unibo.pslab.oop.p09generics.abstractions;

/* Immutable linked list of objects */
public class ObjectList {

	private final Object head;
	private final ObjectList tail;

	public ObjectList(final Object head, final ObjectList tail) {
		this.head = head;
		this.tail = tail;
	}

	public Object getHead() {
		return this.head;
	}

	public ObjectList getTail() {
		return this.tail;
	}

	public int getLength() {
		return (this.tail == null) ? 1 : 1 + this.tail.getLength();
	}

	public String toString() {
		return "|" + this.head + (this.tail == null ? "|" : this.tail.toString());
	}
}
