package it.unibo.pslab.oop.p09generics.iterators;

public class UseIterators2{
    public static void main(String[] s){
    	final Iterator<Integer> iterator = new IntRangeIterator(5,10);
    	
    	final List<String> list = new List<String>("a", 
    	    		    new List<String>("b", 
    	    		    new List<String>("c",null)));
    	final Iterator<String> iterator2 = new ListIterator<>(list);
    	
    	final Vector<java.time.Instant> vector=new Vector<>(); 
    	vector.addElement(java.time.Instant.now());
    	vector.addElement(java.time.Instant.now());
        
        final Iterator<java.time.Instant> iterator3 = new VectorIterator<>(vector);

        UseIterators2.<Integer>printAll(iterator);	      
        UseIterators2.<String>printAll(iterator2);	     
        UseIterators2.<java.time.Instant>printAll(iterator3);
        
        UseIterators2.printAll(iterator3); // invocazione con inferenza
    }
    // generic method
    public static <E> void printAll(final Iterator<E> iterator){
    	while (iterator.hasNext()){
    	    IO.println("Element : "+iterator.next());
    	}
    }
}

