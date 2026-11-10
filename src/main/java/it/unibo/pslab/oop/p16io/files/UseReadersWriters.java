package it.unibo.pslab.oop.p16io.files;

import java.io.*;

public class UseReadersWriters {

	public static final String FILE_NAME = "/home/mirko/aula/oop/15/a.txt";

	public static void main(String[] args) throws Exception {
		try (
			final BufferedWriter w = new BufferedWriter(new FileWriter(FILE_NAME))
		) {
			w.write("Prova");
			w.newLine();
			w.write("di file");
			w.newLine();
		}
		try (
			final BufferedReader r = new BufferedReader(new FileReader(FILE_NAME))
		) {
			IO.println(r.readLine());
			IO.println(r.readLine());
			IO.println(r.readLine()); // null, indica la fine del file!
		}
		try (
			final BufferedReader r = new BufferedReader(new FileReader(FILE_NAME))
		) {
		    String line = null;
		    while( (line = r.readLine()) != null){
		        IO.println(line);
		    }
		}
	}
}
