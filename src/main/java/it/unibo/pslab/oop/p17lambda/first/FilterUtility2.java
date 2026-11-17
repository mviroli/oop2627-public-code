package it.unibo.pslab.oop.p17lambda.first;

import java.util.*;
import java.util.function.Predicate;

public class FilterUtility2 {
	
	public static <X> Set<X> filterAll(Collection<X> set,Predicate<X> filter){
		final Set<X> newSet = new HashSet<>();
		for (final X x: set){
			if (filter.test(x)){
				newSet.add(x);
			}
		}
		return newSet;
	}

	public static void main(String[] args) {
		final List<Integer> ls = List.of(10,20,30,40,50,60);
		
		// Note that the name of the method in Filter is never mentioned here
		IO.println(filterAll(ls,x -> x>20)); // [30,40,50,60]
		IO.println(filterAll(ls,x -> x>20 && x<60)); // [30,40,50]
		IO.println(filterAll(ls,x -> x%20==0)); // [20,40,60]
	}
}
