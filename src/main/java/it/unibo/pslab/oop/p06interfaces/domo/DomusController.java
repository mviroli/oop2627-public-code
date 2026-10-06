package it.unibo.pslab.oop.p06interfaces.domo;

public class DomusController {

	/* Composing multiple pbjects implementing Device */
	private final Device[] devices;

	public DomusController(final int size) {
		this.devices = new Device[size];
	}

	/* Add a new device */
	public void installDevice(final int position, final Device dev) {
		this.devices[position] = dev;
	}

	/* Removing an existing device */
	public void removeDevice(final int position) {
		this.devices[position] = null;
	}

	public Device getDevice(final int position) {
		return this.devices[position];
	}

	/* Switching all devices */
	public void switchAll(final boolean on) {
		for (Device dev : this.devices) {
			if (dev != null) { // Preventing NullPointerException
				if (on) {
					dev.switchOn();
				} else {
					dev.switchOff();
				}
			}
		}
	}

	/* Verifying they're all on */
	public boolean isCompletelySwitchedOn() {
		for (Device dev : this.devices) {
			if (dev != null && !dev.isSwitchedOn()) {
				return false;
			}
		}
		return true;
	}
}
