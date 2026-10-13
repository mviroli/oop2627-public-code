package it.unibo.pslab.oop.p09generics.generics;

public class UseList {
	public static void main(String[] s) {
		final List<Integer> list = new List<Integer>(10, // Autoboxing
				new List<Integer>(20,
						new List<Integer>(30,
								new List<Integer>(40, null))));
		// Casts are NOT necessary
		final int first = list.getHead(); // Unboxing
		final int second = list.getTail().getHead();
		final int third = list.getTail().getTail().getHead();
		IO.println(first + " " + second + " " + third);
		IO.println(list.toString());
		IO.println(list.getLength());

		final List<String> list2 = new List<String>("a",
				new List<String>("b",
						new List<String>("c",
								new List<String>("d", null))));
		IO.println(list2.toString());
	}
}
