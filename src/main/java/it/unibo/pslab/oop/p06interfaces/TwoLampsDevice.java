package it.unibo.pslab.oop.p06interfaces;

public class TwoLampsDevice {

	/* Immutable composition of two Lamps! */
	private final Lamp l1;
	private final Lamp l2;

	/* Composition initialised at construction time */
	public TwoLampsDevice() {
		this.l1 = new Lamp();
		this.l2 = new Lamp();
	}

	/* Getters */
	public Lamp getFirst() {
		return this.l1;
	}

	public Lamp getSecond() {
		return this.l2;
	}

	/* Other methods */
	public void switchOnBoth() {
		this.l1.switchOn();
		this.l2.switchOn();
	}

	public void switchOffBoth() {
		this.l1.switchOff();
		this.l2.switchOff();
	}

	public void ecoMode() {
		this.l1.switchOff();
		this.l2.switchOn();
		this.l2.setIntensity(0.5);
	}

	public String toString() {
		return "TwoLampsDevice [l1=" + l1 + ", l2=" + l2 + "]";
	}	
}
