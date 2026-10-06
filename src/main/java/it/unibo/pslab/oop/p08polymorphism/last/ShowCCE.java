package it.unibo.pslab.oop.p08polymorphism.last;

/* Showing ClassCastException */
public class ShowCCE {
	public static void main(String[] as) {
		Object o = Integer.valueOf(10);
		Integer i = (Integer) o; // OK
		String s = (String) o; // ClassCastException
		// int i = o.intValue(); // No, intValue() not defined
		// String s = (String)i; // No, types not convertible
	}
}
