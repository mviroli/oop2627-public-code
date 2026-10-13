package it.unibo.pslab.oop.p09generics.generics;

public class Vector<X>{
    
    private final static int INITIAL_SIZE = 10;
    
    private Object[] elements; 	
    private int size;		
    
    public Vector(){		
    	this.elements = new Object[INITIAL_SIZE];
    	this.size = 0;
    }
    
    public void addElement(final X e){
    	if (this.size == elements.length){
    	    this.expand();	
    	}
    	this.elements[this.size] = e;
    	this.size++;
    }
    
    public X getElementAt(final int position){
    	// unchecked warning
    	return (X)this.elements[position];
    }
    
    public int getLength(){
    	return this.size;
    }
    
    private void expand(){	
    	final Object[] newElements = new Object[this.elements.length*2];
    	for (int i=0; i < this.elements.length; i++){
    	    newElements[i] = this.elements[i];
    	}
    	this.elements = newElements;
    }
    
    public String toString(){
    	String s="|";
    	for (int i=0; i < size; i++){
    	    s = s + this.elements[i] + "|";
    	}
    	return s;
    }
}
