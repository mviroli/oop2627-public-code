package it.unibo.pslab.oop.p16io.files;

public class Person implements java.io.Serializable {

	private static final long serialVersionUID = 567742502623265945L;
	private final String name;
	private final int birthYear;
	private final boolean married;

	public Person(
			final String name, 
			final int birthYear, 
			final boolean married
	) {
		this.name = name;
		this.birthYear = birthYear;
		this.married = married;
	}

	public String toString() {
		return this.name + ":" + this.birthYear + ":"
				+ (this.married ? "spos" : "non-spos");
	}
}