package it.unibo.pslab.oop.p17lambda.first;

import java.util.*;

public class FilterUtility {
	
	public static <X> Set<X> filterAll(Collection<X> set, Filter<X> filter){
		final Set<X> newSet = new HashSet<>();
		for (final X x: set){
			if (filter.applyFilter(x)){
				newSet.add(x);
			}
		}
		return newSet;
	}

	public static void main(String[] args) {
		final List<Integer> ls = List.of(10,20,30,40,50,60);
		
		// Nota che il nome del metodo in Filter non è mai menzionato qui
		IO.println(filterAll(ls,x -> x>20)); // [30,40,50,60]
		IO.println(filterAll(ls,x -> x>20 && x<60)); // [30,40,50]
		IO.println(filterAll(ls,x -> x%20==0)); // [20,40,60]
	}
}
