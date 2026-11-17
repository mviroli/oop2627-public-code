package it.unibo.pslab.oop.p18streams;

import java.util.*;

public class UseTerminations {

	public static void main(String[] args) {

		final List<Integer> li = List.of(10,20,30,5,6,7,10,20,100);
		IO.print("ForEach:\t ");
		li.stream().forEach(i->IO.print(" "+i));
		
		IO.print("\nForEachOrdered: ");
		li.stream().forEachOrdered(i->IO.print(" "+i));
		
		final Integer[] array = li.stream().toArray(i->new Integer[i]);
		IO.println("\nToArray:\t "+Arrays.toString(array));
		
		//Integer sum = li.stream().reduce(0,(x,y)->x+y);
		final Integer sum = li.stream().reduce(0,Integer::sum);
		IO.println("Sum:\t\t "+sum);
		
		//Optional<Integer> max = li.stream().max((x,y)->x-y);
		final Optional<Integer> max = li.stream().max(Integer::compare);
		IO.println("Max:\t\t "+max);
				
		final long count = li.stream().count();
		IO.println("Count:\t\t "+count);
		
		final boolean anyMatch = li.stream().anyMatch(x -> x==100);
		IO.println("AnyMatch:\t "+anyMatch);
		
		final Optional<Integer> findAny = li.stream().findAny();
		IO.println("FindAny:\t "+findAny);
	}
}

