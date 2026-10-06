package it.unibo.pslab.oop.p05encapsulation;

public class UseLampString{

	public static void main(String[] s){
		final LampString l = new LampString();
    	l.switchOn();
    	l.setIntensity(0.5);
    	l.dim();
    	l.dim();
    	l.brighten();
    	IO.println(l.toString());
    	IO.println("Or : " + l);
    }
}
