package it.unibo.pslab.oop.p13advanced.enums.parameters;

public enum Region {
	ABRUZZO("Abruzzo"), 
	BASILICATA("Basilicata"), 
	CALABRIA("Calabria"), 
	CAMPANIA("Campania"), 
	EMILIA_ROMAGNA("Emilia Romagna"), 
	FRIULI_VENEZIA_GIULIA("Friuli Venezia Giula"), 
	LAZIO("Lazio"), 
	LIGURIA("Liguria"), 
	LOMBARDIA("Lombardia"), 
	MARCHE("Marche"),
	MOLISE("Molise"), 
	PIEMONTE("Piemonte"), 
	PUGLIA("Puglia"), 
	SARDEGNA("Sardegna"), 
	SICILIA("Sicilia"), 
	TOSCANA("Toscana"),
	TRENTINO_ALTO_ADIGE("Trentino Alto Adige"), 
	UMBRIA("Umbria"), 
	VALLE_D_AOSTA("Valle D'Aosta"),
	VENETO("Veneto");
	
	private final String actualName;
	
	private Region(final String actualName){
		this.actualName = actualName;
	}

	public String getName(){
		return this.actualName;
	}
	
	public String toString(){
		return this.getName();
	}
}
