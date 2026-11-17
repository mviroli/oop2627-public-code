package it.unibo.pslab.oop.p18streams;

import java.util.*;
import static java.util.stream.Collectors.*;

public class UseCollectors {

	public static void main(String[] args) {

		final List<Integer> li = List.of(10,20,30,5,6,7,10,20,100);
		
		IO.println(li.stream().collect(toList()));
		IO.println(li.stream().collect(toSet())); 
		IO.println(li.stream().collect(toCollection(TreeSet::new)));
		IO.println(li.stream().collect(minBy(Integer::compare)));
		IO.println(li.stream().collect(summingInt(Number::intValue)).toString());
		IO.println(li.stream().map(i->i.toString()).collect(joining(",","(",")")));
		// (10,20,30,5,6,7,10,20,100)
	}
}

