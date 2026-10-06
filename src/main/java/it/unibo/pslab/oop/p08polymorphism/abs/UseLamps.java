package it.unibo.pslab.oop.p08polymorphism.abs;

public class UseLamps {
	
	public static void main(String[] s) throws Exception { // throws Exception needed here
		LimitedLamp lamp = new UnlimitedLamp();
		lamp.switchOn();
		IO.println("ul| " + lamp);
		for (int i = 0; i < 1000; i++) {
			lamp.switchOff();
			lamp.switchOn();
		}
		IO.println("ul| " + lamp); // not over

		lamp = new CountdownLamp(5);
		for (int i = 0; i < 4; i++) {
			lamp.switchOn();
			lamp.switchOff();
		}
		IO.println("cl| " + lamp);
		lamp.switchOn();
		IO.println("cl| " + lamp); // now over

		lamp = new ExpirationTimeLamp(1000); // 1 sec
		lamp.switchOn();
		IO.println("el| " + lamp);
		Thread.sleep(1100); // waiting 1.1 secs
		IO.println("el| " + lamp); // now over
	}
}
