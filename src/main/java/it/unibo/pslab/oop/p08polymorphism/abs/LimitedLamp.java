package it.unibo.pslab.oop.p08polymorphism.abs;

public abstract class LimitedLamp extends SimpleLamp {

	public LimitedLamp() {
		super();
	}

	/* A final method, regulating coherence with okSwitch() and isOver() */
	public final void switchOn() {
		if (!this.isSwitchedOn() && !this.isOver()) {
			super.switchOn();
			this.okSwitch();
		}
	}

	// What to do as switch succeded? It depends on concrete implementation
	protected abstract void okSwitch();

	// How do we know if the lamp is over? It depends on concrete implementation
	public abstract boolean isOver();

	public String toString() {
		return "Over: " + this.isOver() + 
		       ", switchedOn: "	+ this.isSwitchedOn();
	}
}
