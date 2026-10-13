package it.unibo.pslab.oop.p09generics.abstractions;

public class UseObjectList {
	public static void main(String[] s) {
		final ObjectList list = 
				new ObjectList(10, new ObjectList(20, 
				new ObjectList(30, new ObjectList(40, null))));
		// Casts are necessary, and exceptions are possible
		final int first = (Integer) list.getHead(); // Unboxing
		final int second = (Integer) list.getTail().getHead();
		final int third = (Integer) list.getTail().getTail().getHead();
		IO.println(first + " " + second + " " + third);
		IO.println(list.toString());
		IO.println(list.getLength());

		// Usable with strings as well
		final ObjectList list2 = new ObjectList("a", 
				new ObjectList("b",
				new ObjectList("c", 
				new ObjectList("d", null))));
		IO.println(list2.toString());
	}
}
