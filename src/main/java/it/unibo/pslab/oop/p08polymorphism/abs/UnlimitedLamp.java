package it.unibo.pslab.oop.p08polymorphism.abs;

/* Never over! */
public class UnlimitedLamp extends LimitedLamp {

	public UnlimitedLamp() {
		super();
	}

	/* On switch... do nothing */
	protected void okSwitch() {
	}

	/* Never over */
	public boolean isOver() {
		return false;
	}
}
