package it.unibo.pslab.oop.p04objects;

class UsePerson {
	public static void main(String[] s) {
		// Person p1=new Person(); NO!!
		Person p2 = new Person("Mario Rossi");
		Person p3 = new Person("Gino Bianchi", 1979);
		Person p4 = new Person("Carlo Verdi", 1971, true);
	}
}