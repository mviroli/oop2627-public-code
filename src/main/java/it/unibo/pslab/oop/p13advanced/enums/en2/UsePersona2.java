package it.unibo.pslab.oop.p13advanced.enums.en2;

import static it.unibo.pslab.oop.p13advanced.enums.en2.Regione.*;

import java.util.*;

public class UsePersona2 {
	public static void main(String[] args){
		final ArrayList<Persona> list = new ArrayList<>();
		list.add(new Persona("Mario","Rossi",EMILIA_ROMAGNA));
		list.add(new Persona("Gino","Bianchi",SICILIA));
		list.add(new Persona("Carlo","Verdi",LOMBARDIA));
		final List<Persona> out = Persona.fromRegione(list,EMILIA_ROMAGNA); 
		IO.println(list);
		// [[Mario,Rossi,EMILIA_ROMAGNA], [Gino,Bianchi,SICILIA], 
		// [Carlo,Verdi,LOMBARDIA]]
		IO.println(out);
		// [[Mario,Rossi,EMILIA_ROMAGNA]]
		for (final Persona p: list){
			if (p.isIsolano()){
				IO.println(p);
			}
		}
		// [Gino,Bianchi,SICILIA]
	}
}
