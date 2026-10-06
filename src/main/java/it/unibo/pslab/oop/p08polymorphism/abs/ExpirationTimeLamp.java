package it.unibo.pslab.oop.p08polymorphism.abs;

import java.time.*;

/* Fails after a (real) amount of time after first swicth */
public class ExpirationTimeLamp extends LimitedLamp {

	private Instant firstSwitch;
	private long millisDuration;

	public ExpirationTimeLamp(final long millisDuration) {
		super();
		this.millisDuration = millisDuration;
		this.firstSwitch = null;
	}

	/* On first switch, keep track of current instant */
	protected void okSwitch() {
		if (this.firstSwitch == null) {
			this.firstSwitch = Instant.now();
		}
	}

	/* Over if too much time passed */
	public boolean isOver() {
		return this.firstSwitch != null &&
		   Duration.between(this.firstSwitch, Instant.now()).toMillis() >= this.millisDuration;
	}
}
