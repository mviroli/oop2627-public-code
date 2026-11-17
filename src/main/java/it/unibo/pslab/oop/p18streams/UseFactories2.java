package it.unibo.pslab.oop.p18streams;

import java.util.stream.*;

public class UseFactories2 {

	public static void main(String[] args) {

		IO.print("\nSuppl(random): ");
		Stream.generate(() -> Math.random()) // rand,rand,rand,...
				.limit(5)
				.forEach(i -> IO.print(" " + i));
		// DoubleStream.generate(()->Math.random())... stream unboxed

		IO.print("\nConcat: ");
		Stream.concat(Stream.of("a", "b"), Stream.of(1, 2))
				.forEach(i -> IO.print(" " + i));

		IO.print("\nBuilder: ");
		Stream.builder()
				.add(1)
				.add(2)
				.build()
				.forEach(i -> IO.print(" " + i));

		IO.print("\nRange: ");
		IntStream.range(0, 20) // 0,1,..,19
				.forEach(i -> IO.print(" " + i));
	}
}
