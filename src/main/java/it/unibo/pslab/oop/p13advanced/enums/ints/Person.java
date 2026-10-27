package it.unibo.pslab.oop.p13advanced.enums.ints;

public class Person {
	public static final int LOMBARDIA = 0;
	public static final int EMILIA_ROMAGNA = 1;
	public static final int SICILIA = 2;
	public static final int SARDEGNA = 3; // and so on...
		 
	private final String name;
	private final String surname;
	private final int region;

	public Person(String name, String surname, int region) {
		this.name = name;
		this.surname = surname;
		this.region = region;
	}

	public boolean isIslander() { // Confronto molto veloce!!
		return (this.region == SICILIA || this.region == SARDEGNA);
	}

	public boolean fromRegion(int region){ // Servirebbe controllo sull'input
		return this.region == region;
	}

	public String getRegionName(){
		switch(this.region){
			case 0: return "Lombardia";
			case 1: return "Emilia-Romagna";
			//... and so on
			default: return "?";
		}
	}
}
