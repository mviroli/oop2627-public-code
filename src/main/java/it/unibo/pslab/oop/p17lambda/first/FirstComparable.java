package it.unibo.pslab.oop.p17lambda.first;

import java.util.*;

public class FirstComparable {

	public static void main(String[] args) {
		
		final List<Person> list = new ArrayList<Person>();
		list.add(new Person("Mario",1960,true));
		list.add(new Person("Gino",1970,false));
		list.add(new Person("Rino",1951,true));
		IO.println(list);
		
		// With anonymous class
		Collections.sort(list, new Comparator<Person>(){
			public int compare(Person o1, Person o2) {
				return o1.getBirth() - o2.getBirth();
			}
		});
		IO.println(list);

		// With full-syntax lambda
		Collections.sort(list, (Person o1, Person o2) -> {
			return o1.getBirth() - o2.getBirth();
		});
		IO.println(list);
		
		// With shortcut-syntax lambda
		Collections.sort(list, (o1, o2) -> o2.getBirth() - o1.getBirth());
		IO.println(list);
	}
}
