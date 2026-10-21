package it.unibo.pslab.oop.p12exceptions.classes;

import java.io.*;

public class IOFromKeyboard {

	// Here throws is necessary!
	public static int getIntFromKbd() throws IOException {
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader keyboardInput = new BufferedReader(ISR);
		String line = null;
		line = keyboardInput.readLine(); // IOException
		return Integer.parseInt(line);
	}

	public static void main(String[] args) throws Exception {
			IO.print("Inserisci un numero: ");
			int a = getIntFromKbd();
			IO.println("Hai inserito il num.: " + a);
		
	}
}