package it.unibo.pslab.oop.p09generics.iterators;

/* Iterate from 'start' to 'stop' included */
public class IntRangeIterator implements Iterator<Integer> {

	private int current;
	private final int stop;

	public IntRangeIterator(final int start, final int stop) {
		this.current = start;
		this.stop = stop;
	}

	public Integer next() {
		return this.current++;
	}

	public boolean hasNext() {
		return this.current <= this.stop;
	}
}
