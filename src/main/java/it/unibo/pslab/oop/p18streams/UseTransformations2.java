package it.unibo.pslab.oop.p18streams;

import java.util.*;

public class UseTransformations2 {

	public static void main(String[] args) {
		final List<Integer> li = List.of(10, 20, 30, 5, 6, 7, 10, 20, 100);

		IO.print("\nDistinct\t :");
		li.stream().distinct() // elimina le ripetizioni
				.forEach(i -> IO.print(" " + i));

		IO.print("\nSorted(down)\t :");
		li.stream().sorted((i, j) -> j - i) // ordina
				.forEach(i -> IO.print(" " + i));

		IO.print("\nPeek(.)\t\t :");
		li.stream().peek(i -> IO.print(".")) // una azione ognuno
				.forEach(i -> IO.print(" " + i));

		IO.print("\nLimit(5)\t :");
		li.stream().limit(5) // solo i primi 5
				.forEach(i -> IO.print(" " + i));

		IO.print("\nSkip(5)\t\t :");
		li.stream().skip(5) // salta i primi 5
				.forEach(i -> IO.print(" " + i));
	}
}
