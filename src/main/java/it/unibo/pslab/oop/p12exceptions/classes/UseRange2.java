package it.unibo.pslab.oop.p12exceptions.classes;

public class UseRange2{
    public static void main(String[] s){
    	RangeIterator r = null; // to be created outside try..
    	try{
    		final int a = Integer.parseInt(s[0]);
    		final int b = Integer.parseInt(s[1]);
    	    r = new RangeIterator(a,b);
    	} catch (Exception e){ // catchin any Exception
    	    IO.println("Wrong arguments!");
    	    IO.println(e);
    	    System.exit(1); // abnormal termination
    	}
    	try{
    	    IO.print(r.next()+" ");
    	    IO.print(r.next()+" ");
    	    IO.println(r.next());
    	} catch (java.util.NoSuchElementException e){
    	    IO.println("Iteration not correct...");
    	    IO.println(e);
    	    System.exit(1); // abnormal termination
    	}
    	System.exit(0); // ok termination
    }
}
