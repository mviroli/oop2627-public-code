package it.unibo.pslab.oop.p08polymorphism.last;

import java.util.Arrays;

/* Tutti gli oggetti possono formare un elenco Object[] */
public class AObject {
	public static void main(String[] s) {
		final Object[] os = new Object[5];
		os[0] = new Object();
		os[1] = "string";
		os[2] = Integer.valueOf(10);
		os[3] = new int[] { 10, 20, 30 };
		os[4] = new java.util.Date();
		printAll(os);
		IO.println(Arrays.toString(os));
		IO.println(Arrays.deepToString(os));
	}

	
	public static void printAll(final Object[] array) {
		for (final Object o : array) {
			IO.println("Object:" + o.toString());
		}
	}
}
