package it.unibo.pslab.oop.p14reflection.classes;

class A{
	static { IO.println("A.class loaded");}
	{ IO.println("A.class instantiated"); }
	{ IO.println("A.class instantiated"); }
}

class B extends A{
	static { IO.println("B.class loaded");}
	{ IO.println("B.class instantiated"); }
}

public class Loading {
	static { IO.println("Loading.class loaded");}

	public static void main(String[] args) {
		IO.println("main started");
		new B();
		IO.println("created an object of B");
	}
	/*  Loading.class loaded
		main started
		A.class loaded
		B.class loaded
		A.class instantiated
		A.class instantiated
		B.class instantiated
		created an object of B  */
}
