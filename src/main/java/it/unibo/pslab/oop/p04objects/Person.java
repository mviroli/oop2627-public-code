package it.unibo.pslab.oop.p04objects;

class Person { // dichiarazione classe
	String name;
	int birth;
	boolean married;

	Person(String name) {
		this.name = name;
		this.birth = java.time.LocalDate.now().getYear();
		this.married = false;
	}

	Person(String name, int birth) {
		this.name = name;
		this.birth = birth;
		this.married = false;
	}

	Person(String name, int birth, boolean married) {
		this.name = name;
		this.birth = birth;
		this.married = married;
	}
}