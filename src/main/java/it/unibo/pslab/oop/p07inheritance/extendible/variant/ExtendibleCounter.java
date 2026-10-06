package it.unibo.pslab.oop.p07inheritance.extendible.variant;

/* Il nome ExtendibleCounter è di comodo, più propriamente
 andrebbe chiamata semplicemente Counter */

public class ExtendibleCounter {

    private int value;

    public ExtendibleCounter(final int initialValue) {
        this.value = initialValue;
    }

    public void increment() {
        this.value++;
    }

    public int getValue() {
        return this.value;
    }
    
    protected void setValue(int value) {
    	this.value = value;
    }
}
