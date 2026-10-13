package it.unibo.pslab.oop.p10collections.sortedset;

import java.util.*;

public class UseTreeSetPerson2{
    
	public static void main(String[] s){
    	
    	final Set<Person> set = new TreeSet<>(new PersonComparator());
    	
    	set.add(new Person("Rossi",1960,false));
    	set.add(new Person("Bianchi",1980,true));
    	set.add(new Person("Verdi",1972,false));
    	set.add(new Person("Neri",1972,false));
    	set.add(new Person("Neri",1968,false));
    	
		// Ordered iteration
    	for (final Person p: set){
    	    IO.println(p);
    	}
    }
} 
