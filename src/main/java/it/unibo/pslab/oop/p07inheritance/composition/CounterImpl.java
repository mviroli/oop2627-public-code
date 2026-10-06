package it.unibo.pslab.oop.p07inheritance.composition;

public class CounterImpl implements Counter {

	private int value;

	public CounterImpl(final int initialValue) {
		this.value = initialValue;
	}

	public void increment() {
		this.value++;
	}

	public int getValue() {
		return this.value;
	}
}
