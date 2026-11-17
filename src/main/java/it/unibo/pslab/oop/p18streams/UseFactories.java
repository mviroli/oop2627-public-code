package it.unibo.pslab.oop.p18streams;

import java.util.*;
import java.util.stream.*;

public class UseFactories {

	public static void main(String[] args) {

		final List<Integer> li = List.of(10,20,30,5,6,7,10,20,100);
		IO.print("Collection: ");
		li.stream()
				.forEach(i->IO.print(" "+i));
		
		IO.print("\nEmpty: ");
		Stream.empty()
				.forEach(i->IO.print(" "+i));
		
		IO.print("\nFromValues: ");
		Stream.of("a","b","c")
				.forEach(i->IO.print(" "+i));
		
		IO.print("\nIterate(+1): ");
		Stream.iterate(0,i->i+1)  // 0,1,2,3,...
				.limit(20)
				.forEach(i->IO.print(" "+i));
	}
}

