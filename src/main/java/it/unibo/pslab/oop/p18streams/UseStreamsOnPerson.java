package it.unibo.pslab.oop.p18streams;

import java.util.*;

public class UseStreamsOnPerson {

	public static void main(String[] args) {

		final List<Person> list = new ArrayList<>();
		list.add(new Person("Mario", "Cesena", 20000, "Teacher"));
		list.add(new Person("Rino", "Forlì", 30000, "Football player"));
		list.add(new Person("Lino", "Cesena", 110000, "Chef", "Artist"));
		list.add(new Person("Ugo", "Cesena", 20000, "Secretary"));
		list.add(new Person("Marco", null, 4000, "Contractor"));

		// formattazione a singolo o doppio indent...
		final double result = list.stream()
				.filter(p -> p.getCity().isPresent())
				.filter(p -> p.getCity().get().equals("Cesena"))
				.map(p -> p.getIncome())
				.reduce((a, b) -> a + b)
				.get();

		IO.println(result);

		// alternativa con iteratore: qual è la più leggibile?
		double res2 = 0.0;
		for (final Person p : list) {
			if (p.getCity().isPresent() && p.getCity().get().equals("Cesena")) {
				res2 = res2 + p.getIncome();
			}
		}
		IO.println(res2);
	}
}
