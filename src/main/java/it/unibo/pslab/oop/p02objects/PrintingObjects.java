package it.unibo.pslab.oop.p02objects;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;
import java.util.StringJoiner;

// java.lang.System needs no import

class PrintingObjects {
	public static void main(String[] args) {
		var d = new Date(); // java.util.Date
		IO.println("Current date: " + d.toString());
		IO.println("Millisec. from 1/1/1970: " + d.getTime());

		var r = new Random(); // java.util.Random
		IO.println("Random number: " + r.nextInt());
		IO.println("Another random number: " + r.nextInt());
		IO.println("N. random in (0-99): " + r.nextInt(100));

		var f = new DecimalFormat(); // java.text.DecimalFormat
		IO.println(f.format(1234567.891)); // 1,234,567.891

		var s = new StringJoiner(", "); // java.util.StringJoiner
		s.add("Alice");
		s.add("Bob");
		s.add("Charlie");
		IO.println(s); // Alice, Bob, Charlie
	}
}
