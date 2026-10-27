package it.unibo.pslab.oop.p13advanced.enums.enumeration;

import static it.unibo.pslab.oop.p13advanced.enums.enumeration.Region.*;

import java.util.*;


public class UseRegion {
	public static void main(String[] args) {
		final List<Region> list = new ArrayList<>();
		// 4 modi di ottenere una Regione
		list.add(Region.LOMBARDIA);
		list.add(SARDEGNA);
		list.add(Region.valueOf("SICILIA"));
		list.add(Region.values()[10]);
		
		for (final Region r: list){
			IO.println("toString "+r); // LOMBARDIA,...,MOLISE
			IO.println("ordinale "+r.ordinal()); // 8, 13, 14, 10
			IO.println("nome "+r.name()); // LOMBARDIA,...,MOLISE
			IO.println("---");
		}
		
		for (final Region r: Region.values()){
			IO.print(r+" "); // Stampa tutte le regioni
		}

	}
}
