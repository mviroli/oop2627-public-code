package it.unibo.pslab.oop.p09generics.iterators;

public class UseIterators {
	public static void main(String[] s) {
		final List<Integer> list = new List<>(1, 
				                	new List<>(2, 
				                	  new List<>(3, null)));

		final Vector<Integer> vector = new Vector<>();
		vector.addElement(10);
		vector.addElement(20);

		final Iterator<Integer> iterator = new IntRangeIterator(5, 10);
		final Iterator<Integer> iterator2 = new ListIterator<>(list);
		final Iterator<Integer> iterator3 = new VectorIterator<>(vector);

		// printing from iterators...
		printAll(iterator);
		printAll(iterator2);
		printAll(iterator3);
	}

	// a printAll taking all iterators?
	static void printAll(Iterator<Integer> iterator) {
		while (iterator.hasNext()) {
			IO.println("Elemento : " + iterator.next());
		}
	}
}
