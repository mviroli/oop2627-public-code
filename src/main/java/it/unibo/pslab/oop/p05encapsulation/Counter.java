package it.unibo.pslab.oop.p05encapsulation;

class Counter {

	/* This field is not accessible from outside */
	private int countValue;

	/* It is the constructor that initialises fields! */
	public Counter() {
		this.countValue = 0;
	}

	/* The only way to observe internal state */
	public int getValue() {
		return this.countValue;
	}

	/* The only way to modify internal state */
	public void increment() {
		this.countValue++;
	}
}
