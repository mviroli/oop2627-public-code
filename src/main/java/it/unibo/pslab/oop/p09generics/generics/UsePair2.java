package it.unibo.pslab.oop.p09generics.generics;

public class UsePair2{
    public static void main(String[] s){
    	// Parameters in new Vector() inferred from variable type
    	final Vector<Pair<String,Integer>> v = new Vector<>(); 
    	// Parameters in new Vector() inferred from arguments
    	v.addElement(new Pair<>("Prova",1));		
    	v.addElement(new Pair<>("di",2));		
    	v.addElement(new Pair<>("Vettore",3));
    	final String str = v.getElementAt(0).getFirst() + " " + 
    		     v.getElementAt(1).getFirst() + " " +
    		     v.getElementAt(2).getFirst(); 
    	IO.println(str);
    	IO.println(v);
        
        final List<Pair<Integer,Integer>> l = 
          new List<>(new Pair<>(1,1), 
          new List<>(new Pair<>(2,2),
          new List<>(new Pair<>(3,3),
          null)));
    	IO.println(l);
    	
    	// Local variable type inference
    	final var v2 = new Vector<Integer>();
    	v2.addElement(1);		
    	System.out.println(v2);
    }
}

