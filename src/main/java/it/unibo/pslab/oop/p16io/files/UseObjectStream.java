package it.unibo.pslab.oop.p16io.files;

import java.io.*;

public class UseObjectStream {

	public static void main(String[] args) throws Exception {

		// ostream -> bstream -> file
		try (
			final OutputStream file = new FileOutputStream(UseFile.FILE_NAME);
			final OutputStream bstream = new BufferedOutputStream(file);
			final ObjectOutputStream ostream = new ObjectOutputStream(bstream);
		){
			ostream.writeInt(10000);
			ostream.writeDouble(5.2);
			ostream.writeObject(new java.util.Date()); // Classe serializ.
			ostream.writeObject(new Person("Rossi", 1960, false));
		}

		// ostream2 -> bstream2 -> file2
		try (
			final InputStream file2 = new FileInputStream(UseFile.FILE_NAME);
			final InputStream bstream2 = new BufferedInputStream(file2);
			final ObjectInputStream ostream2 = new ObjectInputStream(bstream2);
		){
			IO.println(ostream2.readInt());
			IO.println(ostream2.readDouble());
			IO.println(ostream2.readObject()); // carica il Date
			IO.println(ostream2.readObject()); // carica la Persona
		}
	}
}
