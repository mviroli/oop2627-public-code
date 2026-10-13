package it.unibo.pslab.oop.p09generics.iterators;

class Random implements ObjectIterator {
	private int counter = 10;

	public Object next() {
		this.counter--;
		return Math.random();
	}

	public boolean hasNext() {
		return this.counter > 0;
	}
	
}

public class UseObjectIterator {
	public static void main(String[] s) {
		ObjectIterator randomNumbers = new Random();
		while (randomNumbers.hasNext()){
			IO.println(randomNumbers.next());
		}
	}
}
