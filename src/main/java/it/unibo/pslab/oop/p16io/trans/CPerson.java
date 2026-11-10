package it.unibo.pslab.oop.p16io.trans;

public class CPerson implements java.io.Serializable {

	// Eclipse would ask to implement a serialVersionUID
	//private static final long serialVersionUID = -8985026380526620812L;

	private String name;
	private int birthYear;
	private boolean married;
	transient private String cachedToString = null;

	public CPerson(String name, int birthYear, boolean married) {
		this.name = name;
		this.birthYear = birthYear;
		this.married = married;
	}

	public String getName() {
		return this.name;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public boolean isMarried() {
		return this.married;
	}

	public void setName(final String name) {
		this.name = name;
		this.cachedToString = null;
	}

	public void setBirthYear(final int birthYear) {
		this.birthYear = birthYear;
		this.cachedToString = null;
	}

	public void setMarried(final boolean married) {
		this.married = married;
		this.cachedToString = null;
	}

	private String computeToString() {
		return this.name + ":" + this.birthYear + ":"
				+ (this.married ? "spos" : "non-spos");
	}

	public String toString() {
		if (this.cachedToString == null) {
			System.err.println("Log: The cache is empty...");
			this.cachedToString = this.computeToString();
		}
		return this.cachedToString;
	}
}