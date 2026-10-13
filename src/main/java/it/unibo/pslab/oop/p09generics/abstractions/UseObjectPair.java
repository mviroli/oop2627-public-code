package it.unibo.pslab.oop.p09generics.abstractions;

public class UseObjectPair {

	public static void main(String[] args) {
		ObjectPair p1 = new ObjectPair(1, "2");
		int i = 1 + (int)p1.getFirst();
		String s2 = "a string... " + (String)p1.getSecond();
		IO.println(i);
		IO.println(s2);
	}

}
