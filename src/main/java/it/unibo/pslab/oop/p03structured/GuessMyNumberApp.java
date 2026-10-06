package it.unibo.pslab.oop.p03structured;

import java.util.Random;

public class GuessMyNumberApp {

	public static void main(String[] args) {
		int number = new Random().nextInt(1, 101);
		for (int i = 1; i <= 10; i++) {
			IO.println("Attempt no. " + i);
			IO.println("Insert your guess.. ");
			int guess = Integer.parseInt(IO.readln());
			if (guess > number) {
				IO.println("My number is lower, try again..");
			} else if (guess < number) {
				IO.println("My number is higher, try again..");
			} else {
				IO.println("You won!!");
				return;
			}
		}
	}
}
