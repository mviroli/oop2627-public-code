package it.unibo.pslab.oop.p16io.trans;

import java.io.*;

import it.unibo.pslab.oop.p16io.files.UseFile;

public class UseTransient {

	public static void main(String[] args) throws Exception {

		try (final ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(UseFile.FILE_NAME))){
			final CPerson p = new CPerson("Rossi", 1960, false);
			IO.println("Prima stampa " + p); // cache vuota
			IO.println("Seconda stampa " + p); // cache non vuota
			out.writeObject(new CPerson("Rossi", 1960, false));
		}

		IO.println("Ri-carico l'oggetto... ");

		try (final ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(UseFile.FILE_NAME))){
			final CPerson q = (CPerson) in.readObject(); //attenzione al cast!
			IO.println("Prima stampa " + q); // cache vuota
			IO.println("Seconda stampa " + q); // cache non vuota
		}
	}
}
