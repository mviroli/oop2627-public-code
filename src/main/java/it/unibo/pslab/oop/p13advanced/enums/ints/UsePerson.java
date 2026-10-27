package it.unibo.pslab.oop.p13advanced.enums.ints;

import java.util.*;

public class UsePerson {
	public static void main(String[] args){
		final List<Person> list = new ArrayList<>();
		list.add(new Person("Mario","Rossi",Person.EMILIA_ROMAGNA));
		list.add(new Person("Gino","Bianchi",Person.SICILIA));
		list.add(new Person("Carlo","Verdi",0)); 
		list.add(new Person("Carlo","Verdi",-23)); // ??

		// Errore sul nome da intercettare via controllo su interi
		IO.println(list.get(0).fromRegion(-23));
		
		// Prestazioni OK!
		for (final Person p: list){
			if (p.isIslander()){
				IO.println(p);
			}
		}
	}
}
