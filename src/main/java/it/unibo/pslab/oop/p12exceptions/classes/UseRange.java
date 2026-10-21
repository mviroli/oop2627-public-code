package it.unibo.pslab.oop.p12exceptions.classes;

public class UseRange{
    public static void main(String[] args){
    	// args keep start and stop, passed from command line
    	final int a = Integer.parseInt(args[0]); // "5"
    	final int b = Integer.parseInt(args[1]); // "10"
    	final RangeIterator r = new RangeIterator(a,b);
    	// remove(); // what if we ùremove?
    	try {
    		IO.print(r.next()+" ");
    		IO.print(r.next()+" ");
    		IO.println(r.next());
    	} catch (final java.util.NoSuchElementException e){
    		IO.println("exception... but we go ahead "+e.toString());
    	}
    	IO.println("end");
    }
}
/* Execution: java UseRange 5 10
   args is: new String[]{"5","10"}
   result:  5 6 7 */
  
/* Execution: java UseRange 5 10.1
   result:  NumberFormatException */
   
/* Execution: java UseRange 5 3
   result:  IllegalArgumentException */

/* Execution: java UseRange 3 4
   result:  NoSuchElementException */ 	
