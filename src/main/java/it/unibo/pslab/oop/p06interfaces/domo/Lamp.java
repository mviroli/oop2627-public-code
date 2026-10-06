package it.unibo.pslab.oop.p06interfaces.domo;

public class Lamp implements Device{
    
    private final static double MIN_VAL = 0.0;
    private final static double MAX_VAL = 1.0;
    private final static double DELTA_VAL = 0.1;
    
    private double intensity;
    private boolean switchedOn;
    
    public Lamp(){
    	this.switchedOn = false;
    	this.intensity = MIN_VAL;
    }
    
    public void switchOn(){
    	this.switchedOn = true;
    }
    
    public void switchOff(){
    	this.switchedOn = false;
    }
    
    private void correctIntensity(){ 
    	if (this.intensity < MIN_VAL) { 
    	    this.intensity = MIN_VAL; 
    	}
    	if (this.intensity > MAX_VAL) { 
    	    this.intensity = MAX_VAL; 
    	}
    }
    public void dim(){
    	this.setIntensity(this.intensity + DELTA_VAL);
    }
    public void brighten(){
    	this.setIntensity(this.intensity - DELTA_VAL);
    }
    public void setIntensity(double value){
    	this.intensity = value;
    	this.correctIntensity();
    }
    
    public double getIntensity(){
    	return this.intensity;
    }
    public boolean isSwitchedOn(){
    	return this.switchedOn;
    }
    
    public String toString(){
        return "I'm a Lamp..";
    }
} 
