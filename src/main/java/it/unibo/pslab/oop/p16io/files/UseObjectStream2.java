package it.unibo.pslab.oop.p16io.files;

import java.io.*;

public class UseObjectStream2 {

	private static final String STR = "/home/mirko/aula/15/prova.bin";

	public static void main(String[] args) throws Exception{

		// Generazione "veloce" di un ObjectStream senza buffering
	    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(STR));
	    // ostream.writeObject(new Object()); Genererebbe una eccezione
		out.writeObject(new java.util.Date()); 
		out.writeObject(new Person("Rossi", 1960, false));
		out.close();

		// ostream2 -> bstream2 -> file2
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(STR));
		// readObject() potrebbe generare un ClassNotFOundException!
		IO.println(in.readObject()); // carica il Date
		IO.println(in.readObject()); // carica la Persona
		in.close();
	}
}
