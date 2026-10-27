package it.unibo.pslab.oop.p13advanced.enums.constants;

public class Region {
	
	public static final Region MARCHE = new Region(0,"Marche");
	public static final Region VENETO = new Region(1,"Veneto");
	public static final Region LOMBARDIA = new Region(2,"Lombardia");
	//... and so on
	
	public static final Region[] VALUES = 
			new Region[] {MARCHE, VENETO, LOMBARDIA};
	
	private final int id;
	private final String name;
	
	private Region(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return "Regione [id=" + id + ", name=" + name + "]";
	}
}
