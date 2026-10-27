package it.unibo.pslab.oop.p13advanced.enums.strings;

public class Person {
	private final String name;
	private final String surname;
	private final String region;

	public Person(String name, String surname, String region) {
		this.name = name;
		this.surname = surname;
		this.region = region;
	}

	public boolean isIslander() { // Confronto lento e incline a errori!!
		return (this.region.equals("Sardegna") || 
				this.region.equals("Sicilia"));
	}

	public boolean fromRegion(String region){
		return this.region.equals(region);
	}

	public String toString() {
		return "Person [" + name + ", " + surname + ", " + region + "]";	}
}
