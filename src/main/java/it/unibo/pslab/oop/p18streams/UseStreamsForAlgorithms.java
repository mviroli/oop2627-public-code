package it.unibo.pslab.oop.p18streams;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class UseStreamsForAlgorithms {

	public static void main(String[] args) {
		IO.println(LongStream.iterate(2, x -> x + 1)
				.filter((i) -> LongStream.range(2, i / 2 + 1).noneMatch(j -> i % j == 0))
				.limit(1000)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(",", "[", "]")));

		final Random r = new Random();
		IO.println(IntStream.range(0, 10000)
				.map(i -> r.nextInt(6) + r.nextInt(6) + 2)
				.boxed() // da int a Integer
				.collect(groupingBy(x -> x,
						collectingAndThen(counting(),
						d -> d / 10000.0))));
		IO.println(
				"Prova di testo: indovina cosa produce la seguente computazione......"
						.chars()
						.mapToObj(x -> String.valueOf((char) x))
						.collect(groupingBy(x -> x, counting()))
						.entrySet()
						.stream()
						.sorted((e1, e2) -> -Long.compare(e1.getValue(), e2.getValue()))
						.limit(3)
						.map(String::valueOf)
						.collect(Collectors.joining(",", "[", "]")));
	}
}
