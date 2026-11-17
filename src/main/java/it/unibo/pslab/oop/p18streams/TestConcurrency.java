package it.unibo.pslab.oop.p18streams;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class TestConcurrency {

	private final static int DIM = 1_000_000; // ~10 gain on me in 2026!!
	private final static int STEPS = 1_000;

	public static void main(String[] args) {
		long time;
		long time2;
		final List<Double> l = IntStream.range(0, DIM)
				.mapToObj(x -> Math.random())
				.collect(toList());

		time = System.currentTimeMillis();
		IntStream.range(0, STEPS).forEach(
				i -> l.stream().collect(Collectors.averagingDouble(x -> x)));
		time = System.currentTimeMillis() - time;
		IO.println("Time: " + time);

		time2 = System.currentTimeMillis();
		IntStream.range(0, STEPS).forEach(
				i -> l.stream().parallel().collect(Collectors.averagingDouble(x -> x)));
		time2 = System.currentTimeMillis() - time2;
		IO.println("Time2: " + time2);
		IO.println("Gain: " + (((double) time) / time2));
	}
}
