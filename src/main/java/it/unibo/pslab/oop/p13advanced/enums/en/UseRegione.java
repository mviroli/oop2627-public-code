package it.unibo.pslab.oop.p13advanced.enums.en;

import java.util.Arrays;

public class UseRegione {
	
	public static void main(String[] args) {
		// nella variabile regione, si possono usare solo 3 casi
		Regione regione = Regione.MARCHE;
		
		IO.println(regione);
		// si ottengono gli array dei valori possibile
		IO.println(Arrays.toString(Regione.VALUES));
		// è possibile accedere alla "prossima regione"
		IO.println(Regione.VALUES[regione.getId()+1]);
	}

}
