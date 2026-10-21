package it.unibo.pslab.oop.p12exceptions.classes;

public class UseRange4{
    public static void main(String[] s){
    	RangeIterator r = null; 
    	try{ 
    		final int a = Integer.parseInt(s[0]);
    	    final int b = Integer.parseInt(s[1]);
    	    r = new RangeIterator(a,b);
    	    IO.print(r.next()+" ");
    	    IO.print(r.next()+" ");
    	    IO.println(r.next());
    	} catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
    	    IO.println("Incorrect type or number of parameters");
    	} catch (Exception e){ 
    	    throw e; 
    	} finally{
    	    IO.println("bye bye..");
    	}
    }
}