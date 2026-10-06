package it.unibo.pslab.oop.p07inheritance.example;

public class LimitedLamp extends SimpleLamp {

	private LimitCounter counter;

	public LimitedLamp(final int limit) {
		super(); // Questa istruzione è opzionale
		this.counter = new LimitCounter(0, limit);
	}

	public void switchOn() {
		if (!this.isSwitchedOn() && !this.counter.isOver()) {
			super.switchOn();
			this.counter.increment();
		}
	}

	public int getRemainingLifeTime() { // delegazione a counter
		return this.counter.getDistanceToLimit();
	}

	public boolean isOver() { // delegazione a counter
		return this.counter.isOver();
	}
}
