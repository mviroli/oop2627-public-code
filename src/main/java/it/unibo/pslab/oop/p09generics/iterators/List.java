package it.unibo.pslab.oop.p09generics.iterators;

public class List<X>{
    
    private X head;
    private List<X> tail;
    
    public List(X head, List<X> tail){
    	this.head = head;
    	this.tail = tail;
    }
    
    public X getHead(){		
    	return this.head;
    }
    
    public List<X> getTail(){
    	return this.tail;
    }
    
    public int getLength(){		
    	return (this.tail == null) ? 1 : 1 + this.tail.getLength();
    }
    
    public String toString(){	
    	return "|"+this.head + 
    	       ((this.tail == null) ? "|" : this.tail.toString());
    }
} 
