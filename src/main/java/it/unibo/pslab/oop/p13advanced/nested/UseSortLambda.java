package it.unibo.pslab.oop.p13advanced.nested;

import java.util.*;

public class UseSortLambda {

	public static void main(String[] args) {
		final List<Integer> list = Arrays.asList(10,40,7,57,13,19,21,35);
		IO.println(list);
		// classe anonima a partire da una interfaccia
		Collections.sort(list,(a,b)->a-b);
		IO.println(list);

		Collections.sort(list,(a,b)->b-a);
		IO.println(list);
	}
}






