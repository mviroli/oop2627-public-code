package it.unibo.pslab.oop.p13advanced.map;

import java.util.*;

public class UseMap {
	
	public static void main(String[] args) {
		
		// Al solito, uso una incarnazione, ma poi lavoro sull'interfaccia
		final Map<Integer, String> map = new HashMap<>();
		// Una mappa è una funzione discreta
		map.put(345211, "Bianchi");
		map.put(345122, "Rossi");
		map.put(243001, "Verdi");

		for (final Map.Entry<Integer, String> entry : map.entrySet()) {
			IO.println(entry.getClass());
			IO.println(entry.getKey());
			IO.println(entry.getValue());
			entry.setValue(entry.getValue()+"...");
		}
		IO.println(map);
		// {345211=null, 243001=null, 345122=null}
	}
}
