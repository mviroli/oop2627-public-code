package it.unibo.pslab.oop.p15gui.mvc.model;

import java.util.Objects;
import java.util.Random;

public class DrawNumberImpl implements DrawNumber {
	private final int min;
	private final int max;
	private final int attempts;
	private int remainingAttempts;
	private int choice;

	public DrawNumberImpl(final int min, final int max, final int attempts) {
		this.min = min;
		this.max = max;
		this.attempts = attempts;
		this.reset();
	}

	public void reset() {
		this.remainingAttempts = this.attempts;
		this.choice = this.min + new Random().nextInt(this.min, this.max + 1);
	}

	public DrawResult attempt(int n) {
		if (this.min > n || this.max < n) {
			throw new IllegalArgumentException();
		}
		return this.remainingAttempts == 0 ? DrawResult.YOU_LOST :
				n > this.choice ? DrawResult.YOURS_IS_HIGHER :
				n < this.choice ? DrawResult.YOURS_IS_LOWER: 
				DrawResult.YOU_WON;
	}
}
