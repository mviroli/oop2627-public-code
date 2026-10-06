package it.unibo.pslab.oop.p08polymorphism.last;

public class VarArgs {
	// sum a variable number of Integer
	public static int sum(final Integer... args) {
		int sum = 0;
		for (int i : args) {
			sum = sum + i;
		}
		return sum;
	}

	// print arguments, if less than 10
	public static void printAll(final String start, final Object... args) {
		System.out.println(start);
		if (args.length < 10) {
			for (final Object o : args) {
				IO.println(o);
			}
		}
	}

	public static void main(String[] s) {
		IO.println(sum(10, 20, 30, 40, 50, 60, 70, 80));
		printAll("inizio", 1, 2, 3.2, true, new int[] { 10 }, new Object());
		
		IO.println("%d %d\n".formatted(10, 20));
	}
}
