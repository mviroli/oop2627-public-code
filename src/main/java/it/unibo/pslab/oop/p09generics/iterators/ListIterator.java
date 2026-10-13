package it.unibo.pslab.oop.p09generics.iterators;

/* Iterate elements of the list */
public class ListIterator<E> implements Iterator<E> {

	private List<E> list;

	public ListIterator(final List<E> list) {
		this.list = list;
	}

	public E next() {
		final E element = this.list.getHead();
		this.list = this.list.getTail();
		return element;
	}

	public boolean hasNext() {
		return (this.list != null);
	}
}
