package it.unibo.pslab.oop.p14reflection.classes;

import java.util.HashSet;
import java.util.Set;

public class Initializers {
	
	static { // static initializer.. executed immediately
		IO.println("Static initializer executed...");
		SET = Set.of(10,20,30); // e.g., it initializes static fields
	}
	
	{	// non-static initializer.. executed before constructor
		IO.println("Non-static initializer executed...");
		set = Set.of(10,20,30,40);
	}
	
	Initializers(){
		IO.println("Constructor executed...");
	}
	
	private static final Set<Integer> SET;
	private final Set<Integer> set;
	// use of non-static initializers with anonymous classes
	private final Set<Integer> set2 = new HashSet<>() {{ add(1); add(2); }};

	public static void main(String[] args) {
		IO.println("Let's create an object..");
		Initializers i = new Initializers();
		IO.println(i.set2);
	}

}
