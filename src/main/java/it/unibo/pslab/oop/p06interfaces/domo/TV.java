package it.unibo.pslab.oop.p06interfaces.domo;

public class TV implements Device {

	private boolean switchedOn;

	public TV() {
		this.switchedOn = false;
	}

	public void switchOn() {
		this.switchedOn = true;
	}

	public void switchOff() {
		this.switchedOn = false;
	}

	public boolean isSwitchedOn() {
		return this.switchedOn;
	}

	public String toString() {
		return "I'm a TV..";
	}
}
