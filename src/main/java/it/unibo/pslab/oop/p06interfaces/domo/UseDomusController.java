package it.unibo.pslab.oop.p06interfaces.domo;

public class UseDomusController{
    
    public static void main(String[] s){
    	// Creating a DomusController
    	final DomusController dc = new DomusController(10);
    	
    	// Installing devices
    	dc.installDevice(0,new Lamp());
    	dc.installDevice(1,new Lamp());
    	dc.installDevice(2,new Lamp());
    	dc.installDevice(3,new TV());
    	dc.installDevice(4,new TV());
    	dc.installDevice(5,new Radio());
    	
    	// Switching devices on
    	dc.switchAll(true);
    	
    	// Verifying they're on
    	final boolean b = dc.isCompletelySwitchedOn(); // true
    }
}
