package it.unibo.pslab.oop.p04objects;

class Person2 { // dichiarazione classe
	String name;
	int birth;
	boolean married;
	
	Person2(String name, int birth, boolean married) {
		this.name = name;
		this.birth = birth;
		this.married = married;
	}

	Person2(String name, int birth) { // richiama costruttore a 3 argomenti
		this(name,birth,false);
	}
	
	Person2(String name) {
		this(name,java.time.LocalDate.now().getYear()); // richiama costruttore a 2 argomenti
	}
}