package it.unibo.pslab.oop.p13advanced.enums.enumeration;

import java.util.*;

public class Person {
	private final String name;
	private final String surname;
	private final Region region;

	public Person(String name, String surname, Region region) {
		this.name = name;
		this.surname = surname;
		this.region = region;
	}

	public boolean isIslander() {
		return this.region == Region.SICILIA || this.region == Region.SARDEGNA;
	}

	public boolean fromRegion(Region region) {
		return this.region == region;
	}

	public String getRegionName() {
		return this.region.name();
	}
}