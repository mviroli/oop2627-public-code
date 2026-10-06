package it.unibo.pslab.oop.p08polymorphism.abs;

/* It becomes over at the n-th switch */
public class CountdownLamp extends LimitedLamp {

	private int countdown;

	public CountdownLamp(final int countdown) {
		super();
		this.countdown = countdown;
	}

	/* On switch... decrement count */
	protected void okSwitch() {
		this.countdown--;
	}

	/* As count is zero... lamp is over */
	public boolean isOver() {
		return this.countdown == 0;
	}
}
