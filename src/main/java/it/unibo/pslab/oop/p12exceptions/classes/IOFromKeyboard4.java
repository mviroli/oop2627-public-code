package it.unibo.pslab.oop.p12exceptions.classes;

public class IOFromKeyboard4 {

	// using IO.readln won't throw excaptions
	public static void main(String[] args) {
		while (true) {
			final int a = Integer.parseInt(IO.readln("Insertisci un numero: "));
			IO.println("Hai inserito il num.: " + a);
		}
	}
}