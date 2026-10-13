package it.unibo.pslab.oop.p09generics.generics;

public class UsePair{
    public static void main(String[] s){ 
    	Pair<String,Integer> p = new Pair<String,Integer>("aa",1);
    	String fst = p.getFirst();
    	int snd = p.getSecond();
    	IO.println(fst+" "+snd);
    	
    	final Vector<Pair<String,Integer>> v = 
    			new Vector<Pair<String,Integer>>(); 
    	v.addElement(new Pair<String,Integer>("Prova",1));		
    	v.addElement(new Pair<String,Integer>("di",2));		
    	v.addElement(new Pair<String,Integer>("Vettore",3));
    	final String str = v.getElementAt(0).getFirst() + " " + 
    		     v.getElementAt(1).getFirst() + " " +
    		     v.getElementAt(2).getFirst(); // Note, no casts!
    	IO.println(str);
    	IO.println(v);
        
    	final List<Pair<Integer,Integer>> l = 
          new List<Pair<Integer,Integer>>(new Pair<Integer,Integer>(1,1),
          new List<Pair<Integer,Integer>>(new Pair<Integer,Integer>(2,2),
          new List<Pair<Integer,Integer>>(new Pair<Integer,Integer>(3,3),
          null)));
    	System.out.println(l);
    }
}

