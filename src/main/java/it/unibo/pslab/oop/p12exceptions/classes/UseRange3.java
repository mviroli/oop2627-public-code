package it.unibo.pslab.oop.p12exceptions.classes;

public class UseRange3{
    public static void main(String[] s){
    	RangeIterator r = null; // could be created inside try...
    	try{ 
    		final int a = Integer.parseInt(s[0]);
    	    final int b = Integer.parseInt(s[1]);
    	    r = new RangeIterator(a,b);
    	    IO.print(r.next()+" ");
    	    IO.print(r.next()+" ");
    	    IO.println(r.next());
    	} catch (ArrayIndexOutOfBoundsException e){
    	    IO.println("Need two arguments!");
    	} catch (NumberFormatException e){
    	    IO.println("Need integer arguments!");
    	} catch (IllegalArgumentException e){
    	    IO.println(e);
    	} catch (Exception e){ // any other exception
    	    throw e; // (re)throw exception
    	} finally{
    	    // this code must be anyway executed
    	    IO.println("bye bye..");
    	}
    }
}
