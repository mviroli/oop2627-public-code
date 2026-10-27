package it.unibo.pslab.oop.p13advanced.enums.en2;

import java.util.*;

public class UseEnum {
	public static void main(String[] args) {
		final List<Regione> list = new ArrayList<>();
		
		list.add(Regione.LOMBARDIA);
		list.add(Regione.PIEMONTE);
		list.add(Regione.EMILIA_ROMAGNA);
		
		for (final Regione r: list){
			IO.println(r.toString());
		}
	}
}
