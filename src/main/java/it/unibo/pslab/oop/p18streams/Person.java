package it.unibo.pslab.oop.p18streams;

import java.util.*;

public class Person {

	private final String name;
	private final Optional<String> city;
	private final double income;
	private final Set<String> jobs;

	public Person(String name, String city, double income, String... jobs) {
		this.name = Objects.requireNonNull(name);
		this.city = Optional.ofNullable(city); // null in ingresso indica città assente
		this.income = income;
		this.jobs = new HashSet<>(List.of(jobs)); // conversione a set
	}

	public String getName() {
		return this.name;
	}

	public Optional<String> getCity() {
		return this.city;
	}

	public double getIncome() {
		return this.income;
	}

	public Set<String> getJobs() {
		return Collections.unmodifiableSet(this.jobs); // copia difensiva
	}

	// .. seguono hashCode, equals e toString
	@Override
	public String toString() {
		return "PersonImpl [name=" + name + ", city=" + city + ", income=" + income
				+ ", jobs=" + jobs + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, city, income, jobs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(city, other.city)
				&& Double.doubleToLongBits(income) == Double.doubleToLongBits(other.income)
				&& Objects.equals(jobs, other.jobs);
	}

}
