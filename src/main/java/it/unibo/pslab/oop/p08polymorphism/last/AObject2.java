package it.unibo.pslab.oop.p08polymorphism.last;

/* Everything is an Object, but which one at runtime?? */
public class AObject2 {
	public static void main(String[] s) {
		final Object[] os = new Object[5];
		os[0] = new Object();
		os[1] = Integer.valueOf(10);
		os[2] = Integer.valueOf(20);
		os[3] = new int[] { 10, 20, 30 };
		os[4] = Integer.valueOf(30);
		printAllAndSum(os);
	}

	/* print the sum of integers in the array */
	public static void printAllAndSum(final Object[] array) {
		int sum = 0;
		for (final Object o : array) {
			System.out.println("Object:" + o.toString());
			if (o instanceof Integer) { // test at runtime
				final Integer i = (Integer) o; // (down)cast
				sum = sum + i.intValue();
			}
		}
		IO.println("Sum of Integers: " + sum);
	}
}
