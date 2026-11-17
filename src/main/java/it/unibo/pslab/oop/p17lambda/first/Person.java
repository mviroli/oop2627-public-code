package it.unibo.pslab.oop.p17lambda.first;

import java.util.Objects;

public class Person {
    
    private final String name;
    private final int birth;
    private final boolean married;
  
    public Person(final String name, final int birth, final boolean married){
    	this.name = name;		
    	this.birth = birth;
    	this.married = married;
    }
    
    public String getName() {
		return name;
	}

	public int getBirth() {
		return birth;
	}

	public boolean isMarried() {
		return married;
	}

	public String toString(){
    	return this.name + ":" + this.birth + ":" + 
    	       (this.married ? "spos" : "non-spos");
    }

	@Override
	public int hashCode() {
		return Objects.hash(name, birth, married);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && birth == other.birth && married == other.married;
	}
}