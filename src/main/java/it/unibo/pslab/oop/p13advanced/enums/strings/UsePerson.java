package it.unibo.pslab.oop.p13advanced.enums.strings;

import java.util.*;

public class UsePerson {
	public static void main(String[] args){
		final List<Person> list = new ArrayList<>();
		list.add(new Person("Mario","Rossi","Emilia-Romagna"));
		list.add(new Person("Gino","Bianchi","Sicilia"));
		list.add(new Person("Carlo","Verdi","EmiliaRomagna")); 
		// Errore sul nome non intercettabile
		IO.println(list.get(0).fromRegion("Emilia Romagna"));
		
		// Prestazioni problematiche su collezioni lunghe
		for (final Person p: list){
			if (p.isIslander()){
				IO.println(p);
			}
		}
	}
}
