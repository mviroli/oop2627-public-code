package it.unibo.pslab.oop.p05encapsulation;

public class Lamp {

   /* Constants for luminosity */
   private static final int LEVELS = 10;
   private static final double DELTA = 0.1;

   /* Fields */
   private int intensity;
   private boolean switchedOn;

   /* Constructor */
   public Lamp() {
      this.switchedOn = false;
      this.intensity = 0;
   }

   /* Handling switching */
   public void switchOn() {
      this.switchedOn = true;
   }

   public void switchOff() {
      this.switchedOn = false;
   }

   public boolean isSwitchedOn() {
      return this.switchedOn;
   }

   /* Handling intensity */
   private void correctIntensity() { // Used only internally
      if (this.intensity < 0) {
         this.intensity = 0;
      } else if (this.intensity > LEVELS) {
         this.intensity = LEVELS;
      }
   }

   public void setIntensity(final double value) {
      this.intensity = Math.round((float) (value / DELTA));
      this.correctIntensity();
   }

   public void dim() {
      this.intensity--;
      this.correctIntensity();
   }

   public void brighten() {
      this.intensity++;
      this.correctIntensity();
   }

   public double getIntensity() {
      return this.intensity * DELTA;
   }

   public String toString() {
	   return "Powered on: " + this.isSwitchedOn() + " Intensity: " + this.getIntensity();
   }
}
