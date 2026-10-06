package it.unibo.pslab.oop.p08polymorphism.person;

public class UsePerson2 {

	public static void main(String[] args) {

		final Person[] people = new Person[] {
				new Student("Marco Rossi", 334612, 2013),
				new Student("Gino Bianchi", 352001, 2013),
				new Student("Carla Verdi", 354100, 2012),
				new Teacher("Mirko Viroli", 34121, new String[] { "OOP", "ASED", "ASMD" }) };

		for (final Person p : people) {
			if (p instanceof Student) {
				final Student s = (Student) p; // Not failing here
				IO.println(s.getName() + " " + s.getMatriculationYear());
			}
		}
	}
}
