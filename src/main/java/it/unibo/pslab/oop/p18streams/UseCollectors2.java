package it.unibo.pslab.oop.p18streams;

import java.util.*;
import static java.util.stream.Collectors.*;

public class UseCollectors2 {

	public static void main(String[] args) {

		final List<Integer> li = List.of(10, 20, 30, 5, 6, 7, 10, 20, 100);

		final Map<Integer, List<Integer>> map = li.stream()
				.collect(groupingBy(x -> x / 10));
		IO.println(map); // {0=[5,6,7], 1=[10,10], ..}

		final Map<Boolean, Optional<Integer>> map2 = li.stream()
				.collect(groupingBy(x -> x % 2 == 0, minBy(Integer::compare)));
		IO.println(map2); // minimo dei pari e minimo dei dispari

		final Map<Integer, Integer> map3 = li.stream()
				.distinct()
				.collect(toMap(x -> x, x -> x + 1));
		IO.println(map3); // mappa ogni x in x+1

		final Map<Integer, Integer> map4 = li.stream()
				.collect(toMap(x -> x / 10, x -> x, (x, y) -> x + y));
		IO.println(map4); // somma degli elementi in ogni decina

		IO.println(li.stream()
				.collect(summarizingInt(Number::intValue)).toString());

	}
}
