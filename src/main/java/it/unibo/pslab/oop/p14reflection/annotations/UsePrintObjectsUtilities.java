package it.unibo.pslab.oop.p14reflection.annotations;

public class UsePrintObjectsUtilities {
	
	public static void main(String[] args) {
		final Person p = new Person("Marco", 100);
		IO.println(PrintObjectsUtilities.objectToString(p));
		// getName->Marco, getId->100, 
		
		final Product pr = new Product("Pr", 200, 100000);
		IO.println(PrintObjectsUtilities.objectToString(pr));
		// qty->100000.0; getName->Pr; getId:200; 
	}
}
