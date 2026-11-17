package it.unibo.pslab.oop.p17lambda.first;

import java.util.*;

public class UseIterators {

	// Uso ancor più compatto del for-each, e sue varianti..
	public static void main(String[] args) {
		final List<Integer> list = List.of(10,20,30,40,50,60,70);
		list.forEach(x -> IO.print(x+" "));
		IO.println();
		
		final Collection<Integer> coll = new HashSet<>();
		list.forEach(x -> coll.add(x)); // list.forEach(coll::add);
		IO.println(coll);
		
		final Iterator<Integer> it = list.iterator();
		IO.println(it.next()+" "+it.next());
		it.forEachRemaining( x -> IO.print(x+" "));
		IO.println();
		
		// Nota: Iterable è una interfaccia funzionale..
		final Iterable<Integer> iterable = () -> list.iterator();
		for (final int i: iterable){ // One of my last uses of "for" :) 
			IO.print(i+" ");
		}
		for (final int i: (Iterable<Integer>)()->list.iterator()){
			IO.print(i+" ");
		}
		IO.println();
	
	}

}
