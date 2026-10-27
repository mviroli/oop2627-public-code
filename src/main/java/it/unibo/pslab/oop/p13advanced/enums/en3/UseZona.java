package it.unibo.pslab.oop.p13advanced.enums.en3;

import static it.unibo.pslab.oop.p13advanced.enums.en3.Zona.*; 

public class UseZona {
	public static void main(String[] args) {
		for (Regione r: NORD.getRegioni()){
			IO.println("toString "+r); 
			// Emilia Romagna,...,Veneto
			IO.println("nome "+r.name());
			// EMILIA_ROMAGNA,...,VENETO
			IO.println("---");
		}
	}
}
