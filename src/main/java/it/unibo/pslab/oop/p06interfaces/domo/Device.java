package it.unibo.pslab.oop.p06interfaces.domo;

/* An interface for devices, defining a contract:
- a device can be switched on
- a device can be switched off
- one can check if it on or off

Note: no indication public/private in methods...
They are public by default!
*/

public interface Device {
	
	void switchOn(); 

	void switchOff(); 

	boolean isSwitchedOn(); 
}
